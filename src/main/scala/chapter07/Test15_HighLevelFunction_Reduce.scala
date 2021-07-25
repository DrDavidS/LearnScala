package chapter07

object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    // 1. reduce
    // list.reduce((a: Int, b: Int) => a + b)
    // 这里可以用sum代替，用reduce只是举例子
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _)) // 从左往右加
    println(list.reduceRight(_ + _)) // 从右往左加

    println("=====================================================")


    val list2 = List(3, 4, 5, 8, 10)
    println(list2.reduce(_ - _))
    println(list2.reduceLeft(_ - _))
    println(list2.reduceRight(_ - _)) // 3 - (4 - (5 - (8 -10))) 注意这里不是从右边往左边减

    // 2. fold
    println("======================== fold =============================")
    println(list.fold(10)(_ + _)) // 10 是初始值：10+1+2+3+4
    println(list.foldLeft(10)(_ - _))

    // 注意底层实现 reverse
    println(list2.foldRight(11)(_ - _))  // 3 - (4 - (5 - (8 - (10 - 11))))
  }
}
