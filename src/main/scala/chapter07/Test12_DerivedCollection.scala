package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 3, 5, 7, 9)
    val list2: List[Int] = List(3, 7, 2, 45, 4, 89)
    // 1. 获取集合的头
    println("======== 获取集合的头部 ============")
    println(list1.head) // 源代码里面就是next把第一个拿出来了

    // 2. 获取集合的尾
    // 注意：不是头的都是尾巴，而不是说最后一个元素是尾巴
    println("======== 获取集合的尾巴 ============")
    println(list1.tail)

    // 3. 集合的最后一个数据
    println("========= 集合的最后一个数据 ========")
    println(list1.last) // 里面有个while循环，所以这是一个O(n)复杂度

    // 4. 初始元素(指不是最后一个的元素，和尾巴相反)
    println("========= 初始数据 ========")
    println(list2.init)

    // 5. 反转
    println("========= 反转数据 ========")
    println(list2.reverse)

    // 6. 取前（后）n个元素
    println("========= 取前（后）n个元素 ========")
    println(list2.take(3))
    println(list2.takeRight(2))

    // 7. 去掉前（后）n个元素
    println("========= 去掉前（后）n个元素 ========")
    println(list2.drop(3))
    println(list2.dropRight(2))

    // 8. 并集
    // 注意Set做并集会去重
    println("========= 并集 ========")
    val union: List[Int] = list1.concat(list2)
    println("union: " + union)
    println(list1 ::: list2)

    // 9. 交集
    println("========= 交集 ========")
    val intersect: List[Int] = list1.intersect(list2)
    println("intersect: " + intersect)

    // 10. 差集
    println("========= 差集 ========")
    val diff1: List[Int] = list1.diff(list2)
    val diff2: List[Int] = list2.diff(list1)
    println("diff1: " + diff1)
    println("diff2: " + diff2)

    // 11. 拉链
    println("========= 拉链 ========")
    println("zip1: " + list1.zip(list2))
    println("zip2: " + list2.zip(list1))

    // 12. 滑窗
    println("========= 滑窗 ========")
    println(list1.sliding(2, 2))  // 还可以加步长
    for (elem <- list1.sliding(2, 2)) println(elem)
  }

}
