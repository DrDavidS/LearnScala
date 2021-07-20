package chapter06

object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
    student.sleep()
  }
}


// 定义一个抽象类
abstract class Person9 {
  // 非抽象属性
  val name: String = "person"

  // 抽象属性：只给声明不给具体值
  var age: Int

  // 非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  // 非抽象方法
  // 没有具体的方法体
  def sleep(): Unit
}


// 定义具体的实现子类
class Student9 extends Person9 {
  // 实现抽象属性
  var age: Int = 18

  // 实现抽象方法
  override def sleep(): Unit = {
    super.eat() // 调用父类方法
    println("student sleep")
  }

  // 重写非抽象属性和方法
  override val name: String = "student"

  override def eat(): Unit = {
    println("student eat")
  }
}
