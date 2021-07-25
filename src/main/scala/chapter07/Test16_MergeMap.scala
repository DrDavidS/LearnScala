package chapter07

import scala.collection.mutable

object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    // 真正的map合并
    val map1: Map[String, Int] = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)
    println(map1 ++ map2) // 这个合并的结果就是map2的值，但是不一定是我们想要的

    // 我们实际上是希望得到字母出现的频率，也就是实际上同key相加，而不是直接覆盖
    // 一般我们只需要遍历元素，然后更新key

    /*
    为什么我们要用foldLeft而不是fold，因为fold里面要求(op: (A1, A1) => A1)
    注意这里就要求传入元组的两个元素类型相同，但是我们传入的kv是 (String, Int) 类型，所以不能用fold

    所以这里我们采用 foldLeft，因为(op: (B, A) => B)可以类型不同

    然后开始写lambda表达式，我们要更新map2的值，所以第一个写map2,
    再来就是要更新里面对应的值，所以就是 ((mergedMap, ???) => ???)
    接下来就是遍历map里面所有元素依次处理，而这些元素就是kv对，所以有 ((mergedMap, kv) => ???)
    最后就是对这些kv对做处理，取出kv里面相关的值。接下来看代码

     */
    val map3: mutable.Map[String, Int] = map1.foldLeft(map2)((mergedMap: mutable.Map[String, Int], kv: (String, Int)) => {
      val key: String = kv._1 // 取Key
      val value: Int = kv._2 // 取Value
      mergedMap(key) = mergedMap.getOrElse(key, 0) + value // 如果有key，则直接加上value
      mergedMap // 返回
    })
    println(map3)
  }
}
