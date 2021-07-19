package chapter06

import scala.beans.BeanProperty

object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2
    student2.name = "Alice"
    student2.age = 18
    println(s"student2: name = ${student2.name}, age = ${student2.age}")

    val student3 = new Student3("Bob", 20)
    println(s"student3: name = ${student3.name}, age = ${student3.age}")

    val student4 = new Student4("Cary", 25)
    // println(s"student4: name = ${student4.name}, age = ${student4.age}")
    student4.printInfo()

    val student5 = new Student5("Bob5", 20)
    println(s"student5: name = ${student5.name}, age = ${student5.age}")

    val student6 = new Student6("Bob6", 20)
    println(s"student6: name = ${student6.name}, age = ${student6.age}")
    student6.printInfo()
  }
}

// 定义类
// 无参数构造器
class Student2 {
  // 单独定义属性
  @BeanProperty
  var name: String = _
  var age: Int = _
}


// 上面定义等价于
class Student3(var name: String, var age: Int) {

}

// 主构造器无修饰
class Student4(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"student4: name = $name, age = $age")
  }
}

// 建议不要采用这种
class Student44(_name: String, _age: Int) {
  var name: String = _name
  var age: Int = _age
}

// 注意这里是VAL，不能再改了
class Student5(val name: String, val age: Int) {

}

class Student6(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit = {
    println(s"student6: name = $name, age = $age, school = $school")
  }
}