package chapter06

// 单例设计模式
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1: Student12 = Student12.getInstance()
    student1.printInfo()

    val student2: Student12 = Student12.getInstance()
    student2.printInfo()

    // 说明全局一份，这就是单例设计模式
    println(student1)
    println(student2)
  }
}

// 定义类
// 加了private 表示主构造器私有化，不能直接调用
// 需要通过伴生对象来搞
class Student12 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name = $name, age = $age, school = ${Student11.school}") // 注意这里的11还是可以用
    // 这里的school是伴生对象里面的
  }
}

// 锇汉式
//object Student12 {
//  private val student: Student12 = new Student12("Alice", 18)
//
//  def getInstance(): Student12 = student
//}

// 懒汉式
// 有实例就返回，没有再创建
object Student12{
  private var student:Student12 = _ // 先给空值，后面该
  def getInstance():Student12 = {
    if (student == null){
      // 如果没有对象实例，则创建一个
      student = new Student12("Alice", 18)
    }
    student
  }
}