package object chapter06 {
  // 定义当前包共享的属性和方法
  val commonValue = "Bilibili"
  def commenMethod() = {
    println(s"我们在$commonValue 学习")
  }
}
