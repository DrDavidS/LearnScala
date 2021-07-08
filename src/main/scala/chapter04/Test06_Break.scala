package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks.break

object Test06_Break {
  def main(args: Array[String]): Unit = {
    println("========= 抛异常退出循环  ========")
    // 1. 采用抛异常的形式退出循环
    try {
      for (i <- 0 until 5) {
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception => // 什么都不做，只是退出循环
    }


    // 2. 使用Scala中 Breaks 类的 break 方法，实现异常的抛出和捕捉
    // 不使用关键字，而是用方法来做Break，这样更面向对象
    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )

    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          break()
        println(i)
      }
    )
    println("这是循环外的代码")
  }
}
