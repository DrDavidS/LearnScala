package chapter08

// 实现key不变，value两倍
object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val list = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))

    // 1. map 转换，实现key不变，value两倍
    val newList: List[(String, Int)] = list.map((tuple: (String, Int)) => (tuple._1, tuple._2 * 2))
    println(newList)

    // 2. 模式匹配也可以对元组元素赋值，实现功能
    val newList2: List[(String, Int)] = list.map(
      (tuple: (String, Int)) => {
        tuple match {
          case (word, count) => (word, count * 2)
        }
      }
    )
    println(newList2)

    // 3. 简化表达式
    val newList3: List[(String, Int)] = list.map {
      case (word, count) => (word, count * 2)
    }
    println(newList3)

    // 偏函数的应用，求整数的绝对值
    // 对输入数据分为不同的情形： 正、负、0
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    // 神奇的函数式编程
    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

    println(abs(13))
    println(abs(-13))
    println(abs(0))
  }
}
