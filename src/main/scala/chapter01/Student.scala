package chapter01

class Student(name:String, var age:Int) {
  def printInfo():Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 引入伴生对象
object Student{
  val school:String = "atguigu_scala"

  def main(args: Array[String]): Unit = {
    val alias = new Student("alice", 20)
    val bob = new Student("bob", 23)

    alias.printInfo()
    bob.printInfo()
  }
}