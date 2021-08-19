package ForTeam.Collections

// 元组最多总共22个元素
/**
tuple到底是啥呢？tuple的括号写法是一种语法定义
 从map里面去看 -> 元组是怎么来的
 点击瞄准器按钮可以看见其手动实现了22种tuple，太猛了
 */
object L10_Tuple {
  def main(args: Array[String]): Unit = {
    // 1. 创建元组
    println("=============== 创建元组 =================")
    val tuple: (String, Int, Char, Boolean) = ("Hello", 100, 'a', true)
    println(tuple)

    // 2. 访问数据
    println("=============== 访问数据 =================")
    println(tuple._1)
    println(tuple._4)

    println(tuple.productElement(0))

    // 3. 遍历元组数据
    println("=============== 遍历 =================")
    for (elem <- tuple.productIterator) {
      println(elem)
    }

    // 4. 嵌套元组
    println("=============== 嵌套元组的访问 =================")
    val mulTuple = (12, 0.3, "hello", (23, "scala"), 66)
    println(mulTuple._4._2)
  }
}
