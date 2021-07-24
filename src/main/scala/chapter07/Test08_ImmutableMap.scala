package chapter07

object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 1. Create a map
    println("=============== Create a map =================")
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 25, "Hello" -> 3)
    println(map1)
    println(map1.getClass)

    // 2.遍历元素
    println("=============== 遍历元素 =================")
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv)) // lambda表达式

    // 3.访问元素
    println("=============== 访问元素 =================")
    for (key <- map1.keys) {
      println(s"$key ---> ${map1.get(key)}")  // Some是指什么？
    }

    // 4.访问某一个key的value
    println(map1.get("a"))  // ctrl+F12看get的源代码，能看见None和Some
    println(map1.get("cc"))  // None
    println(map1("a"))
    // println(map1("cc")) // 会抛异常
    println(map1.getOrElse("cc", "没有这个key")) // 如果没有就返回0
    println(map1.getOrElse("a", "没有这个key")) // 如果没有就返回0
  }
}
