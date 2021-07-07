package chapter04

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    /* java for语法：
            for (int i = 0; i < 10; i++){
              System.out.println("Hello World")
            }
     */

    // 1. 范围遍历
    for (i <- 1 to 5) {
      println(i + "hello world")
    }

    /* 更面向对象一些
      这里实际上点进 to ，里面不是Int的方法而是RichInt的方法。
      这里涉及到了 Int 到 RichInt 的隐式转换。

      这里我们得到了 Range下面的Inclusive
     */
    println("===========分割线========")
    for (i <- 1.to(5)) {
      println(i.+(".hello world"))
    }

    // 如果要不包含边界呢？
    // 直接声明range
    println("===========分割线========")
    for (i <- Range(1, 10)) {
      println(i.+(".hello world"))
    }

    println("===========分割线========")
    for (i <- 1 until 5) {
      println(i + "hello world")
    }

    // 2.集合遍历
    println("\n===========集合遍历========")
    for (i <- Array(12, 34, 53)) {
      println(i)
    }
    for (i <- List(11, 33, 44)) {
      println(i)
    }
    for (i <- Set(112, 333, 22)) {
      println(i)
    }

    // 3. 循环守卫
    println("\n===========循环守卫========")
    for (i <- 1 to 10) {
      if (i != 5) {
        println(i)
      }
    }

    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    // 4. 循环步长
    // 看看源码，其实是通过 Range 实现的
    println("\n===========循环步长========")
    for (i <- 1 to 10 by 2) { // 看看源码，by 其实是通过 Range 实现的
      println(i)
    }
    for (i <- 10 to 1 by -2) { // 倒序
      println(i)
    }
  }
}
