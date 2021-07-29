package chapter09

// 泛型
// p141-p143

/**
 * 语法
 *
 * class MyList[+T]  // 这是协变
 * class MyList[-T]  // 这是逆变
 * class MyList[T]    // 不变
 *
 * 协变：Son 是 Father 的子类，则 MyList[Son] 也作为 MyList[Father] 的子类
 *
 * 逆变：Son 是 Father 的子类，则 MyList[Son] 也作为 MyList[Father] 的父类
 *
 * 不变：Son 是 Father 的子类，则 MyList[Son] 与 MyList[Father] 无父子关系
 */

object Test03_Generics {
  def main(args: Array[String]): Unit = {
    // 1. 协变和逆变
    println("=====  协变和逆变 ==========")
    val child: Parent = new Child
    /* val childList:MyCollection[Parent] = new MyCollection[Child]
    * Child 和 Parent 有父子关系，但是他们作为泛型E，在 MyCollection[E] 中定义为不变
    * 这个集合是没有父子关系的，所以需要有协变，就是变成 MyCollection[+E]
    * 逆变同理，例子如下：
    */
    val childList: MyCollection[SubChild] = new MyCollection[Child]


    // 2. 上下限
    println("=====  泛型上下限 ==========")

    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }
    // test[Parent](new Child)  // 报错，我们要求的上限是Parent
    test[Child](new Child)
    test[Child](new SubChild) // 子类对象传给父类的引用类型
  }
}

// 定义继承关系
class Parent {}

class Child extends Parent {}

class SubChild extends Child {}

// 定义带泛型的集合类型
//
// class MyCollection[+E]{} // 协变
class MyCollection[-E] {}