package chapter06

object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("Alice","123123")
    user.insert()
  }
}


// 用户类
class User(val name: String, val password: String)

trait UserDao {
  // 定义自身类型
  // 目的是使用User的特性，但是又不想继承User
  // 相当于实现了依赖注入
  _: User => // 下划线是别名，换成别的也可以

  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into DB: ${this.name}")
  }
}

// 定义一个注册用户子类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao {

}