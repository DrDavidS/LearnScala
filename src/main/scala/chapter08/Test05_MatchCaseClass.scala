package chapter08

object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student: Student1 = Student1("Alice", 18) // 不用new

    // 针对对象实例的内容进行匹配
    val result: String = student match {
      case Student1("Alice", 18) => "Alice, 18"
      case _ => "Else"
    }
    println(result)
  }
}

// 定义样例类
case class Student1(name: String, age: Int)