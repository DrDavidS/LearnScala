package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1. 整型
    val a1: Byte = 127
    val a2: Byte = -128
    // val a2:Byte = 128 // 报错
    val a3 = 12 // 整数默认类型为int
    // val a4 = 123123123123123132 // too long
    val a4 = 12312312312312313L // 长整型定义，末尾加L

    val b1: Byte = 10
    //val b2: Byte = (10 + 20) // 实际上没有错，虽然报错了

    val b3: Byte = (b1 + 20).toByte // 没毛病，类型转换

    // 2. 浮点类型
    val f1 = 1.234 // 默认是Double
    val f2: Float = 1.234F // 这才是Float

    // 3. 字符类型Char
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    val c3: Char = '\t' // 制表
    println("abc" + c3 + "def")
    // 转义符
    val c5 = '\\' // \ 自身
    val c6 = '\"' // 双引号

    // 字符变量低层保存的是整型数据，ASCII码
    val i1: Int = c1
    println("i1: " + i1) // 打印对于的ASCII码

    val c7: Char = (i1 + 1).toChar
    println("c7: " + c7)

    // 4. bool类型
    // 只占一个字节，只有两种取值
    val isTrue: Boolean = true
    val isFalse: Boolean = false

    // 5. 空类型
    // 5.1 空值Unit
    def m1(): Unit = {
      println("m1 被调用执行")
    }

    val a: Unit = m1()
    println("a:" + a) // 打印出来一个空括号

    //5.2 空引用Null
    //val n: Int = null // error
    var student = new Student("alice", 20)
    student = null
    println("student: " + student) // null

    // 5.3 Nothing
    // Nothing 是所有类型的子类
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }

    val b: Int = m2(0)
    println("b:" + b)
  }
}
