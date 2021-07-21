package chapter06

object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student: Student14 = new Student14
    student.study()
    student.increase()

    student.study()
    student.increase()

    student.dating()
    student.increase()

    println("===========分割线===============")

    // 动态混入
    // 好处就是在创建对象实例的时候才实现对应的特质
    val studentWithTalent:Student14 with Talent = new Student14 with Talent {
      override def dancing(): Unit = println("student is good at dancing.")

      override def singing(): Unit = println("student is good at singing.")
    }

    studentWithTalent.sayHello()
    studentWithTalent.play()
    studentWithTalent.study()
    studentWithTalent.dating()
    studentWithTalent.dancing()
    studentWithTalent.singing()
  }
}

// 再定义一个特质
trait Knowledge {
  var amount: Int = 0

  def increase(): Unit
}

// 定义一个天赋技能特质
// 抽象方法
trait Talent {
  def singing(): Unit

  def dancing(): Unit
}

// 现在有了俩特质
class Student14 extends Person13 with Young with Knowledge {
  // name 和 age 冲突了，所以要重写冲突的属性
  override val name: String = "student"


  // 实现抽象方法1
  override def dating(): Unit = println(s"student $name is dating.")

  // 实现特质中的抽象方法2
  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased: $amount")
  }

  // 新方法
  def study(): Unit = println(s"student $name is studying.")

  //重写父类方法
  override def sayHello(): Unit = {
    super.sayHello() // 调用父类方法，注释掉就不调用了
    println(s"Hello from student $name")
  }
}