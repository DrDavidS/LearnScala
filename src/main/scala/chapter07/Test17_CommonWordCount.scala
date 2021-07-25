package chapter07

/**
 * 普通 WordCount 案例
 *
 * 需求：单词计数：
 * 将集合中出现的相同的单词，进行计数，取计数排名前三的结果
 */

object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    // 定义数据
    val stringList: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )

    /*
    1.对字符串进行切分，得到一个打散所有单词的列表
    首先对字符串空格分词,得到一个嵌套列表
     */
    //    val wordList1: List[Array[String]] = stringList.map(_.split(" "))
    //    val wordList2: List[String] = wordList1.flatten
    //    println(wordList2)

    // 更简单的写法：
    val wordList: List[String] = stringList.flatMap(_.split(" "))
    println(wordList)

    // 2. 相同的单词GroupBy
    // 得到一个Map，可以打印看看是什么内容
    val groupMap: Map[String, List[String]] = wordList.groupBy((word: String) => word)
    println(groupMap)

    // 3. 接下来就是把每一个list里面的单词出现了几次做一个统计
    // 也就是对每个list取长度
    val countMap: Map[String, Int] = groupMap.map((kv: (String, List[String])) => (kv._1, kv._2.length))
    println(countMap)

    // 4. 根据Count值做一个排序
    // 将Map转换为List，并且排序取前三
    println("=============================")
    val sortList: List[(String, Int)] = countMap.toList
      .sortWith(_._2 > _._2) // sortWith(_._2 > _._2)  表示以第二个元素降序排列
      .take(3) // 取前三
    println(sortList)
  }
}
