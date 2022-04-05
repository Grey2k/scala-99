package problemtests

import org.scalatest.funsuite.AnyFunSuite
import problems.Problem1

class Problem1Tests extends AnyFunSuite {
  // test 1
  test("The last element of the List(1, 1, 2, 3, 5, 8) == 8") {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(Problem1.last(list).get == 8)
  }

  test("The empty list has last element == None") {
    val list = List()
    assert(Problem1.last(list).isEmpty)
  }
}
