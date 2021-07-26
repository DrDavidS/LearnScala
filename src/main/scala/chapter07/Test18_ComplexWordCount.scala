package chapter07

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    // 定义数据
    val tupleList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    // 思路一：展开为普通版本
    println("============ 思路1 ==============")
    println("============ 转换为单词列表 ==============")
    val newStringList: List[String] = tupleList.map(
      (kv: (String, Int)) => {
        // 相当于把("hello world", 2) 变成字符串了
        // ("hello world", 2) -> hello world hello world
        (kv._1.trim + " ") * kv._2
      }
    )
    println(newStringList)
    // 接下来操作与普通版本完全一致
    println("============ 进入普通版本 ==============")
    val wordCountList: List[(String, Int)] = newStringList
      .flatMap(_.split(" ")) // 按照空格分词
      .groupBy((word: String) => word) // 按照单词分组
      .map((kv: (String, List[String])) => (kv._1, kv._2.size)) // 统计出每个单词的个数
      .toList // 转换为列表
      .sortBy(_._2)(Ordering[Int].reverse) // 按照次数排序
      .take(3) // 取前三

    println(wordCountList)
    /*
     但是这种方法不够高效，因为我们之前统计过一次，但是我们又抛弃了这个结果
     */


    // 思路二：基于预先统计的结果进行转换
    println()
    println("============ 进入高级版本版本 ==============")
    // step1 将字符串打散为单词，并结合对应的个数包装成二元组
    val preCountList: List[(String, Int)] = tupleList.flatMap(
      (tuple: (String, Int)) => { // 我们拿到的是元组
        val strings: Array[String] = tuple._1.split(" ") // 我们要切开的String
        strings.map((word: String) => (word, tuple._2)) // 每个元素拆开后是一个word，我们要把它变成一个二元组
      }
    )
    println(preCountList)
    // step2 对二元组按照单词进行分组，groupBy
    val preCountMap: Map[String, List[(String, Int)]] = preCountList.groupBy((tuple: (String, Int)) => tuple._1) // 简写你懂的
    println(preCountMap)

    // step3 叠加每个单词去统计个数值
    val countMap: Map[String, Int] = preCountMap.view.mapValues(
      (tupleList: List[(String, Int)]) => tupleList.map(_._2) // 取后面的Int
        .sum // 相加
    ).toMap
    println(countMap)

    // step4 转换为List排序取前三
    val countList: List[(String, Int)] = countMap.toList
      .sortWith((kv1: (String, Int), kv2: (String, Int)) => {
        kv1._2 > kv2._2
      }) // 简写你懂的： .sortWith(_._2 > _._2)
      .take(3)
    println(countList)
  }
}
