package ForTeam.Collections

/**
 * P107
 * 不可变集合，简单来说我们要增删改，需要赋值给新的一个Set对象
 */
object L03_ImmutableSetDemo {
  def main(args: Array[String]): Unit = {
    /* 1. 创建Set
    我们能不能new这么一个玩意儿呢？
    实际上Set是一个特质，trait Set[A] extends Iterable[A]
    不能new

    所以我们还是用伴生对象apply去创建
     */
    println("=========创建Set===========")
    val set1 = Set(13, 23, 53, 12, 13, 16, 78)
    println(set1)

    /* 2. 添加元素
    添加元素的方法
     */
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
