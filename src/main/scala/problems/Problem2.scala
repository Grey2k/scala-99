package problems

object Problem2 {
  def penultimate(list: List[Int]): Option[Int] = {
    list match {
      case List() => None
      case _      => if (list.init.isEmpty) None else Option(list.init.last)
    }
  }

  def run(list: List[Int]): Unit = {
    println("You selected First Problem")
    println("*** ")
    println("Find the last element of a list.")
    println("*** ")
    println("Example: penultimate(List(1, 1, 2, 3, 5, 8))  // 5")
    println("--------------")
    println("Given: ")
    println(s"List: $list")
    if (list.nonEmpty) {
      println(s"Result: ${penultimate(list).get}")
    } else {
      println("List is empty")
    }
  }
}
