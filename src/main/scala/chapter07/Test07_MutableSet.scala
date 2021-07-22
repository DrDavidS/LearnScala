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
    val set2 = set1 + 11
    println(set1)
    println(set2)

    set1 += 1212
    println(set1)

    set1.add(999) // 本质和 += 一样，可以看源码
    println(set1)
  }
}
