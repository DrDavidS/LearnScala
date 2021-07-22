package chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    // 1. 创建一个List
    val list1 = List(23, 65, 87)
    println(list1)

    // 2. 关于访问和遍历
    println(list1(1)) // 获取索引位置为1的元素
    list1.foreach(println)

    // 3. 添加元素
    val list2 = 10 +: list1
    val list3 = list1 :+ 23
    println(list1)
    println(list2)
    println(list3)

    // 4. 合并列表
    println("==============================")
    val list4 = list2.::(51)
    println(list4) // 把 51 放在了开头

    val list5 = Nil.::(13)
    println(list5)

    // 这好用吗？这不好
    val list6 = 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil
    println(list7)

    // 这里是吧 list6 放入 list7
    val list8 = list6 :: list7
    println(list8)

    // 这里才是合并(扁平化)
    val list9 = list6 ::: list7
    println(list9)

    // 这样也可以
    val list10 = list6 ++ list7
    println(list10)
  }
}
