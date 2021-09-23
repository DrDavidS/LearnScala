package chapter04

import scala.math.BigDecimal.double2bigDecimal

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
    // step不能为0
    println("\n===========循环步长========")
    for (i <- 1 to 10 by 2) { // 看看源码，by 其实是通过 Range 实现的
      println(i)
    }
    for (i <- 10 to 1 by -2) { // 倒序
      println(i)
    }
    // Double 弃用，使用BigDecimal
    for (i <- 1.0 to 3.0 by 0.5) {
      println(i)
    }

    // 5. 循环嵌套
    println("\n===========嵌套循环========")
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("i = " + i + " ,j= " + j)
      }
    }
    println("\n===========嵌套循环2========")
    for (i <- 1 to 2; j <- 1 to 4) {
      println("i = " + i + " ,j= " + j)
    }

    // 6. 循环引入变量
    println("\n==========循环引入变量===========")
    for (i <- 1 to 10) {
      val j = 10 - i
      println("i = " + i + " ,j= " + j)
    }

    for (i <- 1 to 10; j = 10 - i) {
      val j = 10 - i
      println("i = " + i + " ,j= " + j)
    }

    for {
      i <- 1 to 10
      j = 10 - i
    } {
      println("i = " + i + " ,j= " + j)
    }

    // 7. 循环返回值
    // for 循环在默认情况下返回值都为空
    println("\n==========循环返回值===========")
    val a: Unit = for (i <- 1 to 10) {
      println(i)
    }
    println("a = " + a)  // 空括号
    println("\n==========循环返回值2===========")
    val b:IndexedSeq[Int] = for (i <- 1 to 10) yield i
    println("b = " + b)
    println(b.last)
  }
}
