package ForTeam.Show

object Tuple01 {
  def main(args: Array[String]): Unit = {
    // 1. 创建元组
    println("=============== 创建元组 =================")
    val tuple: (String, Int, Char, Boolean) = ("Hello", 100, 'a', true)
    println(tuple)

    // 2. 访问数据
    println("=============== 访问数据 =================")
    println(tuple._1)
    println(tuple._4)


    // 3. 遍历元组数据
    println("=============== 遍历 =================")
    for (elem <- tuple.productIterator) {
      println(elem)
    }

    // 4. 嵌套元组
    println("=============== 嵌套元组的访问 =================")
    val mulTuple = (12, 0.3, "hello", (23, "scala"), 66)
    println(mulTuple._4._2)
  }
}
