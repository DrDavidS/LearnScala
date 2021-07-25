package chapter07

object Test11_CommonOps {
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 5, 7, 9)
    val set = Set(2, 4, 6, 8, 10)

    // 1. 获取集合长度
    println(list.length)
    // set 没有 length 方法，看源代码length只有线性序列才有

    // 2.获取集合大小
    println(list.size)
    println(set.size)

    // 3.循环遍历
    for (elem <- list)
      println(elem)

    set.foreach(println)

    // 4. 迭代器
    for (e <- list.iterator) println(e)

    // 5. 生成字符串
    println(list)
    println(set)
    println(list.mkString("--"))

    // 6. 是否包含
    println(list.contains(1))
    println(set.contains(23))
  }
}
