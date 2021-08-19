package ForTeam.Show

object Array01 {
  def main(args: Array[String]): Unit = {
    val arr1: Array[Int] = new Array[Int](5) // 默认元素是0

    // 另一种创建的方式
    val arr: Array[Int] = Array(12, 37, 42, 58, 97) // apply方法可以省略

    // 2. 访问元素
    println("============= 访问元素 =============")
    println(arr(0))
    println(arr(1))
    println(arr(4))
    // println(arr(5))  // 数组越界

    arr(0) = 12
    arr(4) = 57
    arr(4) = 58
    arr.update(0, 10) // 元素更新
    println(arr(0))
    println(arr(4))

    // 3. 数组的遍历
    // 3.1 普通循环
    println("============= 循环 =============")
    for (i <- arr.indices) {
      println(arr(i))
    }

    // 3.2 直接遍历所有元素，增强for循环
    println("============= 循环 =============")
    for (elem <- arr) println(elem)

    // 3.4 调用 foreach
    println("============= foreach =============")
    arr.foreach((elem: Int) => println(elem))
    arr.foreach(println)


    // 4. 添加元素
    println("============= 添加元素 =============")
    val newArr: Array[Int] = arr :+ 73 // 往最后面添加
    println(arr.mkString("--"))
    println(newArr.mkString("--"))

    val newArr2: Array[Int] = 30 +: newArr
    println(newArr2.mkString("--"))

    // 简单点的写法
    val newArr3: Array[Int] = newArr2 :+ 15 // 后面加15
    val newArr4: Array[Int] = 19 +: 29 +: newArr3 :+ 26 :+ 73
    println(newArr4.mkString("--"))
  }
}
