package chapter06

object Test17_Extends {
  def main(args: Array[String]): Unit = {
    // 1. 类型的检测和转换
    val student: Student17 = new Student17("Alice", 18)
    student.sayHi()
    student.study()
    // 把一个子类的对象给了一个父类的引用
    val person: Person17 = new Student17("Bob", 20)
    person.sayHi()

    // 类型判断：全部都是True
    println("student is Student17 " + student.isInstanceOf[Student17])
    println("student is Person17 " + student.isInstanceOf[Person17])
    println("person is Student17 " + person.isInstanceOf[Student17])
    println("person is Person17 " + person.isInstanceOf[Person17])

    val person2: Person17 = new Person17("Cary", 35)
    println("person2 is Student17 " + person2.isInstanceOf[Student17]) // False

    // 类型转换
    if (person.isInstanceOf[Student17]) {
      val newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }

    println(classOf[Student17])
  }
}

class Person17(val name: String, val age: Int) {
  def sayHi(): Unit = {
    println("Hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayHi(): Unit = {
    println("Hi from student " + name)
  }

  def study(): Unit = {
    println("student study")
  }
}
