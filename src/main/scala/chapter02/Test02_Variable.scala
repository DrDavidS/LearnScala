package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量的通用语法
    var a: Int = 10

    // (1)编译器可以进行类型推导，不用写int
    var a1 = 10
    val b1 = 23

    // (2)类型确定后不能修改
    var a2 = 15
    // a2 = "hello

    // (3)变量声明的时候必须有初始值
    //var a3: Int
    var a3: Int = 1

    // (4)var 是可变的，val 是不可变的
    a1 = 12
    // b1 = 11  // 会报错

    //val alice = new Student("alice", 20)
    var alice = new Student("alice", 20)
    alice = new Student("Alice", 20)
    alice = null // var 随便改，val不行

    val bob = new Student("bob", 23)
    bob.age = 24
    bob.printInfo()
  }
}
