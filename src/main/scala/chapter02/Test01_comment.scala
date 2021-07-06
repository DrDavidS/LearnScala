package chapter02
/*
  中间多行文本
  行数1
  行数2
  多行注释完毕。
 */
object Test01_comment {
  /**
   * 这是文档注释。可以自动生成Scala Doc
   * 一般是在一个方法或者一个类里面使用
   * 程序的入口方法
   * @param args 外部传入参数
   */
  def main(args: Array[String]): Unit = {
    // 这是单行注释：打印输出
    println("hello")
  }
}
