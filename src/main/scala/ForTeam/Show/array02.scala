package ForTeam.Show

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object array02 {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变数组
    println("========= 创建可变数组 =============")
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2: ArrayBuffer[Int] = ArrayBuffer(23, 57, 92)
    println(arr1)
    println(arr2)


    // 2. 访问元素
    println("========= 访问元素 =============")
    // println(arr1(0)) // error，里面啥都没有
    println(arr2(1))
    arr2(1) = 39
    println(arr2(1))

    // 3. 添加元素
    println("========= 添加元素 =============")
    val newArr1: ArrayBuffer[Int] = arr1 :+ 15
    println(arr1)
    println(newArr1)
    println(arr1 == newArr1)

    arr1 += 19
    println(arr1)

    77 +=: arr1
    println(arr1)

    val arrToAdd: Array[Int] = Array(1699)
    arr1.appendAll(arrToAdd)
    arr1.prependAll(arrToAdd)
    arr1.insertAll(2, arrToAdd)
    arr1.insert(1, 13)
    println("给人用的方法: " + arr1)


    // 4. 删除元素
    println("========= 删除元素 =============")
    arr1.remove(3)
    println(arr1)

    arr1.remove(0, 3)
    println(arr1)

    arr1.-=(1699)
    println(arr1)

    // 5. 可变数组转换为不可变数组
    println("===== 可变数组转换为不可变数组 =====")
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 56, 98)
    val newArr: Array[Int] = arr.toArray

    println(newArr.mkString(", "))
    println(arr)

    // 6. 不可变数组转换为可变数组
    println("===== 不可变数组转换为可变数组 =====")
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr.mkString(", ")) // 对象地址
  }
}
