package chapter06

object Test04_ClassForAccess {
  def main(args: Array[String]): Unit = {

  }
}

// 定义一个父类
class Person {
  private var idCard: String = "114514"
  protected var name: String = "Alice"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo() = {
    println(s"Person: $idCard $name $sex $age")
  }
}
