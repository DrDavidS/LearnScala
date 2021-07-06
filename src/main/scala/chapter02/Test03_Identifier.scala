package chapter02

object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    // (1)以数字或者下划线开头
    val hello:String = ""
    var Hello123 = ""
    val _abc = 123

    // 下面这两种不行
    // val a-v = ""
    // val 123abc = 234

    // (2)以操作符开头且只包含操作符
    val -+/% = "操作符"
    println(-+/%)

    // (3)用反引号`......``包括的任意字符串，包括Scala关键字也行
    val `if` = "if_else?"
    println(`if`)
  }

}
