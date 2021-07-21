package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()  // 先调用父类方法，再调用子类方法
    student.study()
    student.dating()
    student.play()
  }
}


// 定义一个父类
class Person13 {
  val name: String = "person"
  var age: Int = 18

  def sayHello(): Unit = {
    println("Hello From: " + name)
  }
}

// 定义特质
trait Young {
  // 声明抽象和非抽象的属性
  var age: Int
  val name: String = "young"

  // 声明抽象和非抽象方法
  def play(): Unit = {
    println("Young people are playing")
  }

  def dating(): Unit
}


// 特质和父类里面都有name和age，继承以后到底算谁的？
class Student13 extends Person13 with Young {
  // name 和 age 冲突了，所以要重写冲突的属性
  override val name: String = "student"


  // 实现抽象方法
  override def dating(): Unit = println(s"student $name is dating.")

  // 新方法
  def study(): Unit = println(s"student $name is studying.")

  //重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()  // 调用父类方法，注释掉就不调用了
    println(s"Hello from student $name")
  }
}