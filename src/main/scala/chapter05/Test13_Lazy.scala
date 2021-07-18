package chapter05

object Test13_Lazy {
  // 惰性加载
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 47)  // 这里不会直接调用，直到用了才运行

    println("1. 函数调用")
    println("2. result = " + result)
    println("4. result = " + result) // result已经算过了，存在里面了，不会再算一遍
  }

  def sum(a: Int, b: Int): Int = {
    println("3. sum调用")
    return a + b
  }
}
