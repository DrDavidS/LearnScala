package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    println("=============== Create a mutable map =================")
    val map1: mutable.Map[String, Int] = mutable.Map("Hello" -> 3)
    println(map1)
    println(map1.getClass)

    // 2. add elements
    println("=============== add elements =================")
    map1.put("C", 5) // put 的底层调用了一个update，update又调用的一个 += 方法
    map1.put("d", 9)
    println(map1)

    map1 += (("e", 9))
    map1.update("aa", 10)
    println(map1)

    // 3. 删除元素
    println("=============== remove elements =================")
    map1.remove("Hello") // 用的是一个 -= 方法
    println(map1)
    println(map1.remove("Hello"))

    // 4. 修改元素
    println("=============== modify elements =================")
    map1.put("C", 555) // put 的底层调用了一个update，update又调用的一个 += 方法
    map1.put("d", 999)
    println(map1)

    // 4. 合并map
    println("=============== union maps =================")
    val map2: Map[String, Int] = Map("NiHao" -> 3)
    val map3: Map[String, Int] = Map("Shanghai" -> 6)
    map1 ++= map2
    map1.addAll(map3)
    println(map1)
  }
}
