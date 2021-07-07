package chapter02

object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val n: Int = 130
    val b: Byte = n.toByte
    println(b) // -126，为什么是-126？这个涉及到补码
  }
}
