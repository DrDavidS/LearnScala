package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1: Student7 = new Student7("Alice", 18)
    student1.printInfo()
    println("==============================================")

    val student2: Student7 = new Student7("Bob", 20, "std001")
    student2.printInfo()
    println("==============================================")

    val teacher = new Teacher
    teacher.printInfo()
    println("==============================================")

    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }

    // 传入不同的对象，打印的info格式也不一样
    val person = new Person7
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)
  }
}

// 定义一个父类
class Person7 {
  var name: String = _
  var age: Int = _

  println("1. 父类的主构造器调用")

  def this(name: String, age: Int) = {
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: 姓名：$name  年龄：$age")
  }
}

// 定义子类
// 关键在于继承关系，如果继承的Person7不加括号，就不调用父类的辅助构造器
class Student7(name: String, age: Int) extends Person7(name, age) {
  var stdNo: String = _
  println("3. 子类的主构造器调用")

  def this(name: String, age: Int, stdNo: String) {
    this(name, age) // 调用的父类的构造器
    println("4. 子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: 姓名：$name  年龄：$age  学号：$stdNo")
  }
}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println("Teacher")
  }
}