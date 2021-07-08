package chapter04
/** 构建一个99乘法表
*
 */
object Test03_Practice_MulTable {
  def main(args: Array[String]): Unit = {
    for(i <-  1 to 9){
      for (j <- 1 to i){
        print(s"$j * $i = ${i*j} \t")
      }
      println()
    }

    // 简写
    println("===============")
    for (i <- 1 to 9; j <- 1 to i){
      print(s"$j * $i = ${i*j} \t")
      if (j == i) {
        println()
      }
    }
  }
}
