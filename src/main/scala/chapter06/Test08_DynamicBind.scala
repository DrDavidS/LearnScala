package chapter06

object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8
    /*
    注意这里和JAVA的不同
    在Scala中，属性和方法都是动态绑定的

    在JAVA中属性是静态绑定的，而方法是动态绑定的
     */
    println(student.name)
    student.hello()
  }
}

class Person8 {
  val name: String = "Person"

  def hello(): Unit = {
    println("Hello Person")
  }
}

class Student8 extends Person8 {
  // 在Scala里面要覆盖值或者方法，必须要写override

  override val name: String = "Student"

  override def hello(): Unit = {
    println("Hello Student")
  }
}