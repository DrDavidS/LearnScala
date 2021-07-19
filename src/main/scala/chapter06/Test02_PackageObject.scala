//package chapter06
//
//
//object Test02_PackageObject {
//  def main(args: Array[String]): Unit = {
//    // 包对象的使用
//    commenMethod()
//    println(commonValue)
//  }
//}


// 两种方式都可以
package chapter06 {
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      // 包对象的使用
      commenMethod()
      println(commonValue)
    }
  }
}
