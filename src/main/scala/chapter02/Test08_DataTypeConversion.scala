package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 自动类型转换
    //  1.自动提升原则，不同精度混合运算，以高精度为准
    val a1: Byte = 10
    val b1: Long = 2353L
    val result1: Long = a1 + b1 // 自动变成Long类型
    val result11: Int = (a1 + b1.toInt) // 强转

    //  2. 高精度类型赋值给低精度就会报错
    val a2: Byte = 10
    val b2: Int = a2
    //val c2: Byte = b2 //这样会报错，要强转

    //  3. (byte, short) 和 char 之间不会相互自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
    //val c3: Byte = b3 // 报错
    val c3: Int = b3
    println(c3)

    //  4.byte\short\char可以计算，需要先转换为Int
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c' // ASCII 99
    val result4: Int = a4 + c4
    val result44: Int = a4 + b4 + c4
    println(result4)
    println(result44)

    // 强制类型转换
    // 1. 高精度转换低精度
    val n1: Int = 2.9.toInt
    println("n1: " + n1) // 2

    // 2. 强转符合对最近操作数有效
    val n2: Int = 2.6.toInt + 3.7.toInt // 2 + 3
    val n3: Int = (2.6 + 3.7).toInt // 6.3 --> 6
    println("n2: " + n2)
    println("n3: " + n3)

    // 数值和String 的转换
    val n: Int = 27
    val s: String = n + ""
    println(s)
  }
}
