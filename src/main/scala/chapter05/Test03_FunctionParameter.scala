package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    // 1. 可变参数
    println("===============分隔符==================")

    def f1(str: String*): Unit = {
      println(str)
    }

    f1("Alice")
    f1("aaa", "bbb", "ccc")

    // 2. 如果参数列表中有多个参数，那么可变参数一般放在最后
    println("===============分隔符==================")

    def f2(str1: String, str2: String*): Unit = {
      println("str1: " + str1 + ",  str2: " + str2)
    }

    f2("Alice") // str2打印出来是list
    f2("aaa", "bbb", "ccc") // 这里str2则是ArraySeq

    // 3. 参数默认值
    println("===============分隔符==================")

    def f3(name: String = "Atguigu"): Unit = {
      println("My school is " + name)
    }

    f3("JJYX")
    f3()

    // 4. 带参数名
    println("===============分隔符==================")

    def f4(name: String, age: Int): Unit = {
      println(s"$age 岁的 $name 在这里学习Scala")
    }

    f4("Alice", 20)
    f4(age = 23, name = "Bob") // 可变化顺序，需要带参数名
  }
}
