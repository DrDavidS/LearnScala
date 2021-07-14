package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    //    val stringToUnit: String => Unit = (name: String) => {println(name)}  // 记得采用.var自动推断
    //    val fun = stringToUnit
    val fun = (name: String) => {
      println(name)
    }
    fun("Lambada Function")

    println("====================================")

    // 定义一个函数，以函数作为参数输入
    def f(func: String => Unit): Unit = {
      func("Lambda Func Test")
    }

    f(fun)
    f((name: String) => {
      println(name)
    })

    // 匿明函数的简化原则
    // 1. 参数类型可以省略，会根据形参自动推到
    f((name) => {
      println(name)
    })

    // 2. 类型可省略后，只有一个参数，则圆括号可以省略
    f(name => {
      println(name)
    })

    // 3. 匿名函数如果只有一行，则大括号也可以省略
    f(name => println(name))

    // 4. 如果参数只出现一次，则参数省略且后面的参数可以用_代替
    f(println(_))

    // 5. 如果可以推断出当前传入的println 是一个函数体而不是调用语句，可以直接省略下划线
    f(println)
    println("====================================")

    // 实际示例：定义一个"二元运算"函数，只操作 1 和 2 两个数，具体运输通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    // 匿名函数再简化
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a - b))

    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(_ - _))

    println(dualFunctionOneAndTwo((a, b) => b - a))
    println(dualFunctionOneAndTwo(-_ + _))
  }
}
