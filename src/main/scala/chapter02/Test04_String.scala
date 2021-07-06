package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // (1) 字符串，通过 + 链接
    val name:String = "alice"
    val age:Int = 18
    println(age + "岁的" + name + "在这里学习")
    //*复制多次拼接
    println(name * 3)

    // (2) printf 方法
    printf("%d岁的%s在这里学习，这是一个连续字符串。", age, name)

    // (3) 字符串模板：通过$获取变量值
    println(s"${age}岁的${name}在这里学习，这是字符串模板，很像f-string")

    val num: Double = 2.3456
    println(f"The num is $num%2.2f")  // 格式化模板字符串：整数数字长度为2，后面浮点数只保留两位小数
    println(raw"The num is $num%2.2f")
  }
}
