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
    val f1: Int => Int = f
    val f2 = f _ // 空一格，加下划线

    println(f1) // 打印出来是函数的引用地址
    println(f1(12))
    println("===============================")

    // 2. 函数可以作为函数的参数传递
    // 定义一个二元计算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 35)) // 也可以匿名函数
    println("===============================")

    // 3. 函数可以作为函数的返回值返回
    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6 调用" + a)
      }

      return f6 // 将函数直接返回
    }
    val f6 = f5()
    println(f6)  // 这里得到的是一个引用
    println(f6(25))
  }
}
