// 用嵌套风格定义包
package com {

  import com.atguigu.scala.Inner // 需要先调用内层包

  // 在外层包中定义单例对象
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner)
    }
  }

  package atguigu {
    package scala {
      // 内层包中定义单例对象
      object Inner {
        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }

  }

}

// 在同一个文件中定义多个包
package aaa {
  package bbb {

    import com.atguigu.scala.Inner // 需要先调用内层包

    object Test01_Package {
      def main(args: Array[String]): Unit = {
        println(Inner)
      }
    }
  }

}