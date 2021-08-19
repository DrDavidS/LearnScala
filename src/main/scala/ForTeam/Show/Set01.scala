package ForTeam.Show

object Set01 {
  def main(args: Array[String]): Unit = {
    println("=========创建Set===========")
    val set1 = Set.apply(13, 23, 53, 12, 13, 16, 78)
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
