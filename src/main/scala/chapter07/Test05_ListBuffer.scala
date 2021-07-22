package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2: ListBuffer[Int] = ListBuffer(12, 52, 75)

    println(list1)
    println(list2)

    println("=========================")

    // 2. 添加元素
    // 推荐用appendAll\prependAll
    list1.append(15, 62)
    list2.prepend(20)
    list1.insert(1, 19)

    println(list1)
    println(list2)

    println("=========================")
    // 那些冒号的方法就不写了，太乱了太恶心了
    // 老老实实appendAll

    // 3. 合并list
    val list3 = list1 ++ list2
    println(list3)
    println(list1.appendAll(list2))
    println(list2.prependAll(list1))

    // 4. 修改元素
    println("=========================")
    list2(3) = 333
    println(list2)
    list2.update(3, 666)  // 实际上调用的是这个
    println(list2)

    // 5. 删除元素
    println("=========================")
    list2.remove(2)
    list2.-=(20)
    println(list2)
  }
}
