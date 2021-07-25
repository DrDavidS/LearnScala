package chapter07

object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // 1. 过滤
    // 选取偶数
    val evenList: List[Int] = list.filter((elem: Int) => {
      elem % 2 == 0
    })
    println(evenList)

    // 选取奇数
    println(list.filter(_ % 2 == 1)) // lambda 简写
    println("=================================")

    // 2. map
    println(list.map(_ * 2)) // 把集合中每个数乘以二
    println(list.map(x => x * x)) // 把集合中每个数平方
    println("=================================")

    // 3. 扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))

    val flatList: List[Int] = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)

    // 更简单的方法
    val flatList2: List[Int] = nestedList.flatten
    println(flatList2)

    // 4. 扁平映射
    // 将一组字符串进行分词，然后保存成单词的列表
    println("============== 扁平映射 ===================")
    val strings: List[String] = List("Hello World", "Hello Scala", "Hello Java", "We study")
    val splitList: List[Array[String]] = strings.map(_.split(" ")) // 分词
    val flattenList: List[String] = splitList.flatten // 打撒，扁平化

    println(flattenList)

    // 真正的扁平映射
    val flatmapList: List[String] = strings.flatMap(_.split(" "))
    println(flatmapList)

    // 5. 分组操作，也就是GroupBy
    println("============== 分组操作 ===================")
    // 分成奇数和偶数两组
    val groupMap: Map[Int, List[Int]] = list.groupBy(_ % 2)
    val groupMap2: Map[String, List[Int]] = list.groupBy((data: Int) => {
      if (data % 2 == 0) "偶数" else "奇数"
    })

    println(groupMap)
    println(groupMap2)

    // 给定一组词汇，按照单词的首字母分组
    val wordList = List("Chine", "America", "Alice", "Bob", "Japan", "Canada", "Intel")
    println(wordList.groupBy(_.charAt(0)))
  }
}
