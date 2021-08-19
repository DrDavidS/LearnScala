package ForTeam.Show

object List01 {
  def main(args: Array[String]): Unit = {
    println("============= 创建一个List =================")

    val list1 = List(23, 65, 87)
    println("list1 ==> " + list1)

    println("============= 访问和遍历 =================")
    println(list1(1)) // 获取索引位置为1的元素
    list1.foreach(println)

    println("============= 添加元素 =================")
    val list2 = 10 +: list1
    val list22 = list1.+:(10)
    val list3 = list1 :+ 23

    println("list2 ==> " + list2)
    println("list22 ==> " + list22)
    println("list3 ==> " + list3)

    println("============= 合并列表 =================")
    val list4 = 51 :: list2
    println("list4 ==> " + list4) // 把 51 作为 head 放在了开头
    println("list4.tail ==> " + list4.tail)

    val list5 = Nil.::(13) // Nil作为空列表也可以调用这个方法，相当于创建了一个列表
    println("list5 ==> " + list5)

    // 我们用下面的方法创造列表。这好用吗？这不好
    val list6 = 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil
    println("list6 ==> " + list6)
    println("list7 ==> " + list7)

    // 这里是吧 list6 放入 list7
    val list8 = list6 :: list7
    println(list8)

    // 这里才是合并(扁平化)
    val list9 = list6 ::: list7
    println(list9)

    // 这样也可以
    val list10 = list6 ++ list7
    println( "list10" + list10)
  }
}
