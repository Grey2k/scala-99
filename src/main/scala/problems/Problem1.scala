package problems

object Problem1 {
  def last(list: List[Int]): Option[Int] = {
    list match {
      case List() => None
      case _      => Option(list.last)
    }
  }

  def run(list: List[Int]): Unit = {
    println("You selected First Problem")
    println("*** ")
    println("Find the last element of a list.")
    println("*** ")
    println("Example: last(List(1, 1, 2, 3, 5, 8))  // 8")
    println("--------------")
    println("Given: ")
    println(s"List: $list")
    if (list.nonEmpty) {
      println(s"Result: ${last(list).get}")
    } else {
      println("List is empty")
    }
  }
}
