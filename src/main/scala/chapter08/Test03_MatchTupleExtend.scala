package chapter08

object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    // 1. 在变量声明的时候匹配
    val (x, y) = (10, "hello")
    println(s"x: $x, y: $y")

    //val List(first, second, _*) = List(23, 15, 9, 78) // _* 代表剩下的
    //println()

    val fir :: sec :: rest = List(23, 15, 9, 78) // 这样的话rest才可以代表剩下的
    println(s"first: $fir, second: $sec, rest: $rest")
    println("============================")
    // 2. for 推导式中模式匹配
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 33))

    // 2.1 原本的遍历方式
    for (elem <- list) {
      println(elem._1 + " " + elem._2)
    }

    // 2.2 将List的元素直接定义为元组，对变量赋值
    for ((word, count) <- list) {
      println(word + " " + count)
    }

    // 2.3 不考虑某个位置的变量，只遍历key或者value
    for ((word, _) <- list) {
      println(word)
    }

    // 2.4 指定某个位置的值必须是多少
    // 这里结果是一个12，一个33
    for (("a", count) <- list) {
      println(count)
    }
  }
}
