package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建Person对象
    val person: Person = new Person()
    // person.id 访问不到
    // person.name 访问不到，因为只能在当前类以及子类里面访问，现在是在外部了
    println(person.age)
    println(person.sex)

    person.printInfo()
    println("================================")
    val worker: Worker = new Worker()
    worker.age = 20
    worker.sex = "None"

    println(worker.age)
    println(worker.sex)
    worker.printInfo()
  }
}

// 定义一个子类
// 注意继承怎么写
class Worker extends Person {
  override def printInfo(): Unit = {
    println("Worker: ")
    //  println(idCard)  // error，私有属性不能访问到
    //    name = "Bob"
    //    age = 25
    //    sex = "male"

    println(s"Worker: $name $sex $age")
  }
}