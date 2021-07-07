package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 1. 算术运算符
    val result1: Int = 10 / 3
    println(result1)

    val result2: Double = 10 / 3 // 这里还是先整数除法
    println(result2)

    val result3: Double = 10.0 / 3 // 这里对了
    println(result3.formatted("%2.2f"))

    val result4: Int = 10 % 3
    println(result4)

    // 2. 关系运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    val isEqual: Boolean = s1 == s2
    println(isEqual) // scala不再判断引用地址
    println(s1.equals(s2))
    println(s1.eq(s2)) //如果要判断引用地址

    // 3. 逻辑运算符
    def m(n: Int): Int = {
      println("m被调用")
      return n
    }

    val n = 1
    println((4 > 5) && m(n) > 0)
    println((4 < 5) && m(n) > 0)

    // 判断一个字符串是不是为空
    def isNotEmpty(str: String): Boolean = {
      // return !(str == "") // 如果传进来是null，也是空，但是这样会报错
      return str != null && !("".equals(str.trim()))
    }

    println("isNotEmpty: " + isNotEmpty(null))

    // 4. 赋值运算符
    var b: Byte = 10
    var i: Int = 12
    i += 1
    println(i)

    // 5. 位运算符
    val a = 60
    println("60 左移三位： " + (a << 3))
    println("60 右移两位： " + (a >> 2))

    val b1: Short = -13
    println(b1 << 2)
    println(b1 >> 2)
    println(b1 >>> 2) // 无符号

    // 6. 运算符的本质
    // 在底层都是对象的方法调用
    val n1: Int = 12
    val n2: Int = 37
    println(n1.+(n2)) // 真实是这种情况，n1 这个 int 类型的一个叫做 + 的方法
    println(n1 + n2)

    println(1.34.*(2))  // 举个例子就是这样
  }
}