package chapter05

// 函数至简原则
object Test04_Simplify {
  def main(args: Array[String]): Unit = {
    def f0(name: String): String = {
      return name
    }

    println(f0("Alice"))
    println("===============分隔符==================")

    // 1. return 可以省略, Scala 会使用函数体的最后一行代码作为返回值
    def f1(name: String): String = {
      name
    }

    println(f1("Bob"))
    println("===============分隔符==================")

    // 2. 如果函数体只有一行代码，可以省略花括号
    def f2(name: String): String = name

    println(f2("Cindy"))
    println("===============分隔符==================")

    // 3. 返回值的类型如果可以推断，那么可以省略
    def f3(name: String) = name

    println(f3("David"))
    println("===============分隔符==================")

    // 4. 如果有return ，则不能省略返回值类型
    def f4(name: String): String = {
      // name
      return name
    }

    println(f4("Ella"))
    println("===============分隔符==================")

    // 5. 如果函数明确声明Unit，那么函数中即使有 return 也不起作用
    def f5(name: String): Unit = {
      return name // return不起作用
    }

    println(f5("Frank"))
    println("===============分隔符==================")

    // 6. 如果Scala期望是无返回值类型，省略等号
    def f6(name: String) {
      println(name)
    }

    println(f6("Grace"))
    println("===============分隔符==================")

    // 7. 如果函数没有参数，但是声明了参数列表，那么调用时候小括号可以不加
    def f7(): Unit = {
      println("Learn Scala F7")
    }
    // 两种调用都行
    f7()
    f7
    println("===============分隔符==================")


    // 8. 如果函数没有参数列表，那么小括号可以省略，调用时候小括号必须省略
    def f8: Unit = {
      println("Learn Scala F8")
    }

    f8
    println("===============分隔符==================")

    // 9.如果不关心名称，那么只关心逻辑，那么函数名 (def) 可以省略
    // 匿名函数
    def f9(name: String): Unit = {
      println(name)
    }
    // 匿名函数
    (name: String) => {
      println(name)
    }

      println("===============分隔符==================")
  }
}
