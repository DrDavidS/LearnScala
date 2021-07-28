package chapter09

import scala.language.implicitConversions

// p138-p140
// 隐式转换
object Test02_Implicit {
  def main(args: Array[String]): Unit = {
    val new12 = new MyRichInt(12)
    println(new12.myMax(15))

    // 1. 隐式函数
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)

    println(12.myMax(15))
    println("======================")

    // 2. 隐式类
    // 不能定义在顶级位置，只能定义在比如object里面
    implicit class MyRichInt2(val self: Int) {
      // 自定义比较大小的方法
      def myMax2(n: Int): Int = if (n < self) self else n

      def myMin2(n: Int): Int = if (n < self) n else self
    }

    println(12.myMax2(15))
    println("======================")

    // 3. 隐式参数
    // 同一个作用域内，同类隐式参数只能有一个。
    // 但是可以传默认值，隐式参数优先。
    implicit val str: String = "Alice"

    def sayHello(implicit name: String = "Bob"): Unit = {
      println("Hello, " + name)
    }

    def sayHi(name: String = "Alice"): Unit = {
      println("Hi, " + name)
    }

    sayHello // 不要括号
    sayHi()
    println("======================")

    // 简便写法
    implicit val age: Int = 18

    def hiAge(): Unit = {
      println("Hi, " + implicitly(age))
    }

    hiAge()
  }
}

// 自定义类
class MyRichInt(val self: Int) {
  // 自定义比较大小的方法
  def myMax(n: Int): Int = if (n < self) self else n

  def myMin(n: Int): Int = if (n < self) n else self
}
