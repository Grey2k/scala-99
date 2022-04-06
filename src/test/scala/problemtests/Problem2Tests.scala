package problemtests

import org.scalatest.funsuite.AnyFunSuite
import problems._

class Problem2Tests extends AnyFunSuite {
  // test 1
  test("The last but one element of the List(1, 1, 2, 3, 5, 8) == 5") {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(Problem2.penultimate(list).get == 5)
  }

  test("The list of one element has last but one == None") {
    val list = List(1)
    assert(Problem2.penultimate(list).isEmpty)
  }

  test("The empty list has last but one element == None") {
    val list = List()
    assert(Problem2.penultimate(list).isEmpty)
  }
}
