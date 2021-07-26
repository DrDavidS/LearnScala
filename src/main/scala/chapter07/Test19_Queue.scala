package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    // 1. 创建一个可变队列
    println("============ 可变队列 =============")
    val queue = new mutable.Queue[String]()

    // 入队操作
    queue.enqueue("a", "b", "c")
    println(queue)
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    //    println(queue)
    //    println(queue.dequeue())  // 空
    queue.enqueue("a", "b", "c", "d", "e")

    // 2. 创建不可变队列
    println("============ 不可变队列 =============")
    val queue2: Queue[String] = Queue("a", "b", "c")
    // queue2.enqueue("d")
    val queue3: Queue[String] = queue2.enqueue("d")
    println(queue2)  // 不变的
    println(queue3)



  }
}
