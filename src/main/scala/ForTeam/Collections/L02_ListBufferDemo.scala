package ForTeam.Collections

import scala.collection.mutable.ListBuffer

/**
 * 可变list
 */

object L02_ListBufferDemo {
  def main(args: Array[String]): Unit = {
    /* 1. 创建可变列表
      我们可以创建 ListBuffer ，然后把它的泛型[Int]直接写出来
      也可以直接用它的伴生对象的apply方法，往里面塞数据
      Scala推荐采用伴生对象
     */
    println("===========创建可变列表==============")
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2: ListBuffer[Int] = ListBuffer(12, 52, 75)

    println("new 一个 List：" + list1)
    println("apply方法List：" + list2)

    // 2. 添加元素
    // Scala 2.13 中推荐用appendAll\prependAll
    println("========== 添加元素==============")
    list1.append(15, 62) // 后面添加
    list2.prepend(20) // 前面添加
    list1.insert(1, 19) // 指定位置添加

    println(list1)
    println(list2)

    println("=========奇奇怪怪的方法================")
    31 +=: 96 +=: list1 += 25 += 11
    println("一堆+=  ==> " + list1)


    // 3. 合并list
    println("===========合并list==============")
    val list3 = list1 ++ list2 // 其实是做了一个新列表，有clone()
    println(list3)

    // 如果需要放到原来的列表里面
    // list2不变，list1追加了list2
    list1 ++= list2
    println(list1)
    println(list2)

    // 还有更恶心的，list2变化而list1不变
    list1 ++=: list2
    println(list1)
    println(list2)

    // 4. 既然是可变列表，那么自然可以修改元素
    println("===========修改元素==============")
    list2(3) = 333  // = 号的底层是什么？
    println(list2)
    list2.update(3, 666) // 实际上调用的是这个
    println(list2)

    // 5. 删除元素
    println("=============删除元素============")
    list2.remove(2)
    list2.-=(20)
    println(list2)
  }
}
