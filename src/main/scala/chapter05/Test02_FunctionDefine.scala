package chapter05

object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    // 1. 无参数无返回值
    def f1(): Unit = {
      println("1 无参数，无返回值：")
    }

    println(f1())
    println("=========== 分割线 ===============")

    //  2. 无参数有返回值
    def f2(): Int = {
      println("2 无参数，有返回值：")
      return 12
    }

    println(f2())
    println("=========== 分割线 ===============")

    //  3. 无参数有返回值
    def f3(name: String): Unit = {
      println("3 有参数，无返回值：" + name)
    }
    println(f3("Alice"))
    println("=========== 分割线 ===============")

    //  4. 有参数有返回值
    def f4(name: String): String = {
      println("4 有参数，有返回值：" + name)
      return "return: Hi"
    }
    println(f4("Alice"))
    println("=========== 分割线 ===============")

    //  5. 多参数，无返回值
    def f5(name1: String, name2:String): Unit = {
      println("5 多参数，有返回值：")
      println(s"$name1 和 $name2 是两个参数")
    }
    println(f5("Alice", "Bob"))
    println("=========== 分割线 ===============")

    //  6. 多参数，有返回值
    def f6(name1: String, name2:String): String = {
      println("6 多参数，有返回值：" + name1 + name2)
      return "return: f6"
    }
    println(f6("Alice", "Bob"))
  }
}
