package problems

object Problem3 {
  def nth(n: Int, list: List[Int]): Option[Int] = {
    list match {
      case List() => None
      case _      => if (list.lift(n).isEmpty) None else Option(list.lift(n).get)
    }
  }

  def run(n: Int, list: List[Int]): Unit = {
    println("You selected Third Problem")
    println("*** ")
    println("Find the Kth element of a list.")
    println("*** ")
    println("Example: nth(2, List(1, 1, 2, 3, 5, 8))  // 2")
    println("--------------")
    println("Given: ")
    println(s"List: $list")
    if (list.nonEmpty) {
      println(s"Result: ${nth(n, list).get}")
    } else {
      println("List is empty")
    }
  }
}
