package chapter07

object Test13_SimpleFunctions {
  def main(args: Array[String]): Unit = {

    val list: List[Int] = List(3, 7, 2, 45, 4, 89)
    val list2: List[(String, Int)] = List(("a", 5), ("b", 3), ("c", 8), ("d", -3), ("e", -5))
    // 1. 求和
    // 1.1 简单写法
    var sum = 0
    for (elem <- list) {
      sum += elem
    }
    println(sum)
    // 1.2 sum方法
    println(list.sum)
    // 2. 乘积
    println(list.product)
    // 3. 最大值
    println(list.max)
    println(list2.max) // 元组类型判断的是第一个元素
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2)) // 简化
    // 4. 最小值
    println(list.min)
    println(list2.minBy(_._2))
    // 5. 排序
    // 5.1 sorted
    val sortedlist: List[Int] = list.sorted
    println(sortedlist) // 从小到大
    println(list.sorted(Ordering[Int].reverse)) // 从大到小
    // 5.2 sortBy
    println(list2.sorted)
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse)) // 从大到小
    // 5.3 sortWith
    println(list.sortWith((a: Int, b: Int) => {
      a < b
    }))
    println(list.sortWith(_ < _))
    println(list.sortWith(_ > _))
  }
}
