package chapter07


// 不可变集合，简单来说我们要增删改，需要赋值给新的一个Set对象
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建Set
    println("=========创建Set===========")
    val set1 = Set(13, 23, 53, 12, 13, 16, 78)
    println(set1)
    


    // 2. 添加元素
    println("===========添加元素=========")
    val set2 = set1 + 20
    println(set2)

    // 3. 合并集合
    println("==========合并集合==========")
    val set3 = Set(13, 19, 23, 22, 66, 99)
    // val set4 = set3 + set2  // 会报错，只能加元素不能加集合
    val set4 = set3 ++ set2
    println(set4)

    // 4. 删除元素
    println("==========删除元素==========")
    val set5 = set3 - 13
    println(set5)
  }
}
