package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f 调用")
      n + 1
    }

    val result = f(123)
    println(result)

    // 1. 函数可以作为值进行传递

  }
}
