package chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    // 创建一个对象
    val student = new Student()
    // student.name //error 不能访问私有
    println(student.age)  // 默认0
    println(student.sex)  // 默认null
    student.sex = "female"
    println(student.sex)
  }
}

// 定义一个类
class Student {
  // 定义属性
  private var name: String = "Alice"
  @BeanProperty
  var age: Int = _  // 默认值
  var sex: String = _ // 默认值
}
