package chapter04

import scala.io.StdIn

object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    // 1. 单分支
    println("========= 单分支 =========")
    if (age >= 18) {
      println("成年")
    }


    //2. 双分支
    println("========= 双分支 =========")
    if (age >= 18) {
      println("成年")
    } else {
      println("未成年")
    }

    // 3. 多分支
    println("========= 多分支 =========")
    if (age <= 6) {
      println("童年")
    } else if (age < 18) {
      println("青少年")
    } else if (age < 35) {
      println("青年")
    } else if (age < 60) {
      println("中年")
    } else {
      println("老年")
    }

    // 分支语句的返回值
    // 默认是Unit，但是我们可以指定返回值
    println("========= 分支返回值 =========")
    val result: Any = if (age <= 6) {
      println("童年")
      "童年"
    } else if (age < 18) {
      println("青少年")
      "青少年"
    } else if (age < 35) {
      println("青年")
      "青年"
    } else if (age < 60) {
      println("中年")
      age
    } else {
      println("老年")
      age
    }
    println("result: " + result)

    // JAVA 中三元运算符 a?b:c
    val res1: String = if (age >= 18) {
      "成年"
    } else {
      "未成年"
    }
    // 另一种写法，更简洁
    val res2 = if (age >= 18) "成年" else "未成年"

    // 5. 嵌套分支
    // if 里面套 if
    println("========= 嵌套分支 =========")
    if (age >= 18) {
      println("成年")
      if (age >= 35) {
        if (age > 60) {
          println("老年")
        } else {
          println("中年")
        }
      }
    } else {
      println("未成年")
      if (age <= 6) {
        println("童年")
      } else {
        println("青少年")
      }
    }
  }
}
