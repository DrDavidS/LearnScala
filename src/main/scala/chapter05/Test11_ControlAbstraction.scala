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
    println("================================")
    // 2. 传名参数：传递的不再是具体的值，而是代码块
    // => 这里就是表示这是一个代码块，而且它的返回值是一个Int
    def f2(a: =>Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
    f2(23)
    f2(f1())  // 这里f1()被调用了两次，因为f1()传给了a，a调用了两次。
  }
}
