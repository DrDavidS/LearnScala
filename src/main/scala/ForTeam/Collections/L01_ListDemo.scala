package ForTeam.Collections


/**
 * P103-P105
 * 这里我们简单看看，List的基本应用。
 * 本节中，List这里特指的是不可变的List，可变的叫做ListBuffer
 */
object L01_ListDemo {
  def main(args: Array[String]): Unit = {
    /* 1. 创建一个List
    可以先看看List的实现，List是一个抽象类，所以我们创建List对象采用的是它的伴生对象的apply方法创建
    new List() 是不对的，因为它继承自 sealed abstract class List[+A] ，是一个抽象类，所以直接创建对象不行
    实际上List调用的是一个apply()方法，由于apply()可以省略，所以看起来是直接一个List()就行了
    val list1 = List.apply(23, 65, 87)
    */
    println("============= 创建一个List =================")
    val list1 = List(23, 65, 87)
    println("list1 ==> " + list1)

    /* 2. 关于访问和遍历
      获取List中的某些元素，注意我们是不能给他赋值的，比如list(1) = 12
     */
    println("============= 访问和遍历 =================")
    println(list1(1)) // 获取索引位置为1的元素
    list1.foreach(println)

    /* 3. 添加元素
    添加元素是调用List对象的某种方法，可以添加元素
    +: 和 :+ 都是一种方法，但是省略了点号.
     */
    println("============= 添加元素 =================")
    val list2 = 10 +: list1
    val list3 = list1 :+ 23

    println("list2 ==> " + list2)
    println("list3 ==> " + list3)

    /* 4. 合并列表
    调用了一种双冒号方法
    :: 是 new scala.collection.immutable.::(x, this) 这么一个实例
    里面调用了自己的构造方法，这个双冒号它本身就是一个list
     */
    println("============= 合并列表 =================")
    val list4 = list2.::(51)
    println("list4 ==> " + list4) // 把 51 作为 head 放在了开头
    println("list4.tail ==> " + list4.tail)

    val list5 = Nil.::(13) // Nil作为空列表也可以调用这个方法，相当于创建了一个列表
    println("list5 ==> " + list5)

    // 我们用下面的方法创造列表。这好用吗？这不好
    val list6 = 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil
    println("list7 ==> " + list7)

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
