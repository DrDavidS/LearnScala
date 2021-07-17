package chapter05

object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1. 常规传值参数
    def f0(a: Int): Unit = {
      println("a = " + a)
    }

    f0(23)

    def f1(): Int = {
      println("f1 调用")
      12
    }

    f0(f1())

    // 2. 传名参数

  }
}
