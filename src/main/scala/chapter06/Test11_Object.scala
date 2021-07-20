package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
    //    val student = new Student11。("Alice", 18)
    //    student.printInfo()

    val student1: Student11 = Student11.newStudent("Alice", 18)
    student1.printInfo()

    println("========================================")
    val student2: Student11 = Student11.apply("Bob", 12)
    student2.printInfo()

    println("========================================")
    val student3: Student11 = Student11("Cary", 16)  // 实际上这是调用的伴生对象的apply
    student3.printInfo()
  }
}

// 定义类
// 加了private 表示主构造器私有化，不能直接调用
// 需要通过伴生对象来搞
class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name = $name, age = $age, school = ${Student11.school}")
    // 这里的school是伴生对象里面的
  }
}

// 定义伴生对象
// 名字必须和类一样
object Student11 {
  val school: String = "atguigu"

  // 定义一个类的对象实例的创建方法
  // 工厂方法
  // 注意：在当前伴生对象中是可以访问伴生类里面的私有对象和方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  // 对于单例对象的 apply 方法，Scala有特殊规则，就是调用的时候可以省略
  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}