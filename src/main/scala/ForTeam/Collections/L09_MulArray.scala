package ForTeam.Collections

// Scala 最多原生支持5维数组
object L09_MulArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3) // 两行，三列

    // 2. 访问元素
    array(0)(2) = 19
    array(1)(0) = 25

    // println(array.mkString(", "))  // 这样打印出来是引用，不太行
    for (i <- array.indices; j <- array(i).indices) {
      print(array(i)(j) + "\t")
      if (i != array.length - 1 && j == array(i).length - 1) println()
    }

    // 或者
    println("\n=================")
    array.foreach(_.foreach(println))
  }
}
