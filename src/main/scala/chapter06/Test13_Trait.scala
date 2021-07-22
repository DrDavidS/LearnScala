package chapter06

/**
 * 特质
 *
 * 在Java中，一个类只能继承一个父类，这叫"单继承"。
 * Scala可以通过 Trait 来避免抽象类的单继承限制。
 *
 * 举例：
 * 类A继承了父类Parent，并且具有了B，C，D的功能。
 * 在Scala的语境中，就是说类A继承了Parent类的全部特性（就像一个人继承了父母的基因），
 * 同时带上了自己本身特有的性质B，C，D
 *
 * 就像一个人可以有兄弟姐妹，你和你的兄弟姐妹都带有父母的基因，但是你总会有一些不同于你的兄弟姐妹的特点，
 * 比如只有你会讲德语，而你的兄弟姐妹都不会。这个你会讲德语，就是你的特质Trait
 */
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