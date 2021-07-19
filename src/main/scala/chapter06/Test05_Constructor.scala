package chapter06

object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1 // 本质上是调用柱构造器
    student1.Student1()
    println("=======================================")
    val student2 = new Student1("Alice")
    println("=======================================")
    val student3 = new Student1("Bob", 25)
  }
}

// 定义一个类
// 花括号前面不加东西，说明这是一个省略的空括号的形态
class Student1 {
  // 定义属性
  var name: String = "Alice"
  var age: Int = 23

  println("1. 主构造方法被调用")

  // 声明辅助构造方法
  // 注意必须是this
  // 不需要任何返回值
  def this(name: String) {
    this() // 直接调用主构造器
    println("2. 辅助构造方法1被调用")
    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age: Int) {
    this(name)
    println("3. 辅助构造方法2调用")
    this.age = age
    println(s"name: $name age: $age")
  }

  def Student1(): Unit = {
    println("不是构造方法被调用，而是一般方法被调用")
  }
}
