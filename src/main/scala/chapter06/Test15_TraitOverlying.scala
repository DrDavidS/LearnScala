package chapter06

// 测试特征的叠加顺序
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase() // 输出的是知识增加

    // 钻石问题，特征叠加
    // 注意顺序！这里显示了叠加顺序
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}


// 定义球类特征
trait Ball {
  def describe(): String = "Ball"
}

// 定义颜色特征
trait ColorBall extends Ball {
  var color: String = "Red"

  override def describe(): String = color + "-" + super.describe() // Red Ball
}

// 定义种类特征
trait CategoryBall extends Ball {
  var category: String = "Foot"

  override def describe(): String = category + "-" + super.describe()
}

// 自定义一个球类
class MyFootBall extends CategoryBall with ColorBall {
  // 不用方括号指定，这里就先调用ColorBall
  override def describe(): String = "My ball is a " + super.describe()

  // override def describe(): String = "My ball is a " + super[CategoryBall].describe() // 指定继承
}

trait Knowledge15 {
  var amount: Int = 0

  def increase(): Unit = {
    println("Knowledge increased.")
  }
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("Talent increased.")
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def dancing(): Unit = println("Dancing~")

  override def singing(): Unit = println("Singing~")

  override def increase(): Unit = super.increase() // 问题来了，这个super到底是谁的呢？最后一个的特征的
}