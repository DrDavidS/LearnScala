package chapter07

import scala.collection.parallel.CollectionConverters._
import scala.collection.parallel.immutable.ParSeq
/**
 * https://github.com/scala/scala-parallel-collections
 *
 * Scala 2.13之后，并行集合模块变成了[外部库](https://github.com/scala/scala-parallel-collections)，
 * 直接像2.12那样写如下的代码，IDE会报“Cannot resolve symbol par”
 * 这个时候，需要在maven项目的pom.xml中手动导入如下依赖：
 * ===注意我们的Scala版本是2.13，请选择你合适的版本===
 *
    <!-- https://mvnrepository.com/artifact/org.scala-lang.modules/scala-parallel-collections -->
    <dependency>
        <groupId>org.scala-lang.modules</groupId>
        <artifactId>scala-parallel-collections_2.13</artifactId>
        <version>1.0.3</version>
    </dependency>
 */

// 并行集合
object Test20_Parallel {
  // 串行
  def main(args: Array[String]): Unit = {
    val result1: IndexedSeq[Long] = (1 to 100).map(
      (x: Int) => Thread.currentThread.getId
    )
    println(result1)

    // 并行
    val result2:ParSeq[Long] = (1 to 100).par.map(
      (x: Int) => Thread.currentThread.getId
    )
    println(result2)
  }
}
