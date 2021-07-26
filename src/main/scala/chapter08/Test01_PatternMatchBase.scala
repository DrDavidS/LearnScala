package chapter08

object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    // 1. 基本定义语法
    // 不需要所谓的Break
    val x: Int = 2
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    // 2. 示例：用模式匹配实现简单的二元运算
    println("=========================")
    val a = 25
    val b = 13

    def matchDualOp(op: Char): Any = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _ => "非法运算符"
    }

    println(matchDualOp('+'))
    println(matchDualOp('-'))
    println(matchDualOp('*'))
    println(matchDualOp('/'))
    println(matchDualOp('\\'))

    println("========================")

    // 3. 模式守卫——如果要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
    // 求一个整数的绝对值
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case j if j < 0 => -j
      }
    }
    println(abs(67))
    println(abs(117))
    println(abs(-23))
  }
}
