package chapter02

object Test07_DtaType {
  def main(args: Array[String]): Unit = {
    // 1. 整型
    val a1:Byte = 127
    val a2:Byte = -128
    // val a2:Byte = 128 // 报错
    val a3 = 12 // 整数默认类型为int
    // val a4 = 123123123123123132 // too long
    val a4 = 12312312312312313L  // 长整型定义，末尾加L

    val b1:Byte = 10
    val b2:Byte = (10 + 20)  // 实际上没有错，虽然报错了

    val b3:Byte = (b1 + 20).toByte // 没毛病，类型转换

    // 2. 浮点类型
    val f1 = 1.234 // 默认是Double
    val f2:Float = 1.234F // 这才是Float

    // 3. 字符类型Char

  }
}
