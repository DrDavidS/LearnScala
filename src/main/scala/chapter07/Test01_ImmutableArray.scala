package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组
    val arr: Array[Int] = new Array[Int](5) // 默认元素是0

    // 另一种创建的方式
    val arr2 = Array(12, 37, 42, 58, 97) // apply方法可以省略

    // 2. 访问元素
    println("============= 访问元素 =============")
    println(arr(0))
    println(arr(1))
    println(arr(4))
    // println(arr(5))  // 数组越界

    arr(0) = 12
    arr(4) = 57
    arr(4) = 58
    arr.update(0, 10) // 元素更新
    println(arr(0))
    println(arr(4))

    // 3. 数组的遍历
    // 3.1 普通循环
    println("============= 循环 =============")
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
    // 更简洁，可以看看indices的源码，这是推荐写法
    for (i <- arr.indices) println(arr(i))
    println("============= 增强循环 =============")

    // 3.2 直接遍历所有元素，增强for循环
    for (elem <- arr2) println(elem)

    // 3.3 迭代器的使用
    println("============= 迭代器 =============")
    val iter = arr2.iterator

    while (iter.hasNext) {
      println(iter.next)
    }

    // 3.4 调用 foreach
    println("============= foreach =============")
    arr2.foreach((elem: Int) => println(elem))
    arr.foreach(println)

    println(arr2.mkString("--")) // 所有元素双横线连接
  }
}
