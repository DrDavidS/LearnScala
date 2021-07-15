package chapter05

object Test08_Practice {
  def main(args: Array[String]): Unit = {
    // 练习1
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(23, "", '0'))
    println(fun(0, "hello", '0'))

    // 练习2
    println("====================================")

    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }

        f2
      }

      f1
    }
    // 先调用func，第二是f1，第三是f2
    // 依赖的局部变量存在heap里面，不会因为释放而丢失
    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println(func(23)("")('0'))
    println(func(0)("hello")('0'))

    // 匿名函数简写
    println("====================================")

    def func_simple(i: Int): String => (Char => Boolean) = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }

    println(func_simple(0)("")('0'))
    println(func_simple(0)("")('1'))
    println(func_simple(23)("")('0'))
    println(func_simple(0)("hello")('0'))

    // 柯里化
    // 所以这tm跟直接传三个参数有啥区别？
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(func2(0)("")('0'))
    println(func2(0)("")('1'))
    println(func2(23)("")('0'))
    println(func2(0)("hello")('0'))
  }
}
