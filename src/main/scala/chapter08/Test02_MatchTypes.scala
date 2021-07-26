package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    // 1. 匹配常量
    def describeConst(x: Any): String = x match {
      case 1 => "Int One"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "Nothing"
    }

    println(describeConst("hello"))
    println(describeConst('+')) // 注意这里是单引号
    println(describeConst(0.3))

    println("===============================")

    // 2. 匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int" + i
      case s: String => "String" + s
      case list: List[String] => "List" + list.toString()
      case array: Array[Int] => "Array[Int]" + array.mkString(",")
      case a => "Something else:" + a
    }

    println(describeType(35))
    println(describeType("hello"))
    println(describeType(List("hi", "hello")))
    println(describeType(List(2, 3))) // 泛型擦除
    println(describeType(Array("hi", "hello")))
    println(describeType(Array(2, 3)))
    println("===============================")

    // 3. 匹配数组
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 20, 30)
    )) {
      val result: String = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1, 0)"
        case Array(x, y) => "Array: " + x + "," + y // 匹配两元素数组
        case Array(0, _*) => "以0开头的数组" // 匹配数组的第一个元素为0，剩下的不限
        case Array(x, 1, z) => "中间为1的三元素数组"
        case _ => "Something else"
      }
      println(result)
    }
    println("===============================")

    // 4. 匹配列表
    // 方式1
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88)
    )) {
      val result: String = list match {
        case List(0) => "0"
        case List(x, y) => "List(x, y): " + x + ", " + y
        case List(0, _*) => "List(0, ...)"
        case List(a) => "List(a): " + a
        case _ => "Something else"
      }
      println(result)
    }
    // 方式2
    val list = List(1, 2, 5, 7, 24) // 如果不太够的话，就是something else
    list match {
      case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
      case _ => println("something else")
    }
    println("===============================")

    // 5. 匹配元组
    for (tuple <- List(
      (0, 1),
      (0, 0),
      (0, 1, 0),
      (0, 1, 1),
      (1, 23, 56),
      ("hello", true, 0.5)
    )) {
      val result: String = tuple match {
        case (a, b) => "" + a + ", " + b
        case (0, _) => "(0, _)"
        case (a, 1, _) => "(a, 1, _)" + a
        case (x, y, z) => "(x, y, z)" + x + " " + y + " " + z
        case _ => "something else"
      }
      println(result)
    }
  }
}
