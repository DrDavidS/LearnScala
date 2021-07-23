package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变Set
    println("=========创建Set===========")
    val set1: mutable.Set[Int] = mutable.Set[Int](13, 23, 53, 12, 13, 16, 78)
    println(set1)

    // 2. 添加元素
    println("========= 添加元素 ===========")
    set1 + 1111  // 不改变内容
    val set2:mutable.Set[Int] = set1 + 11  // 建议使用集合Union
    println(set1)
    println(set2)

    set1 += 1212
    println(set1)

    val flag1:Boolean = set1.add(10) // 本质和 += 一样，可以看源码
    println(set1)
    println(flag1)

    val flag2:Boolean = set1.add(10) // 第二次返回的是False，因为已经有了
    println(set1)
    println(flag2)

    // 3. 删除元素
    println("========= 删除元素 ===========")
    set1 -= 1212  // 不改变内容
    println(set1)

    val flag3:Boolean = set1.remove(1212)  // 成功返回true，失败返回false
    println(set1)
    println(flag3)

    // 4. 合并集合
    println("========= 合并集合 ===========")
    val set3:mutable.Set[Int] = set1 ++ set2
    println(set3)

    set1 ++= set3
    println(set1)
    println(set3)

    val set4:mutable.Set[Int] = set1.union(set3)
    println(set4)
  }
}
