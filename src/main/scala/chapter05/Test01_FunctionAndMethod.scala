package chapter05
/*
函数和方法的区别，简单来说方法是对象的方法，调用的时候要通过对象去调用
但是函数【狭义的】可以写在main函数里，就是一个函数而已。不算是一个方法
 */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi! " + name)
    }

    // 调用函数
    sayHi("Alice")

    // 调用对象的方法
    Test01_FunctionAndMethod.sayHi("Bob")

    //获取方法的返回值
    val result = Test01_FunctionAndMethod.sayHello("Cary")
    println("result" + result)
  }
  // 定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi! " + name)
  }

  def sayHello(name: String): String = {
    println("Hello! " + name)
    return "Hello"
  }
}
