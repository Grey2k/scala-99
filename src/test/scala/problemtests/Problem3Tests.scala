package problemtests

import org.scalatest.funsuite.AnyFunSuite
import problems._

class Problem3Tests extends AnyFunSuite {
  // test 1
  test("Find the 2nd element of the List(1, 1, 2, 3, 5, 8) == 2") {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(Problem3.nth(2, list).get == 2)
  }

  test("Index out of list bounds == None") {
    val list = List(1)
    assert(Problem3.nth(2, list).isEmpty)
  }

  test("The empty has any element == None") {
    val list = List()
    assert(Problem3.nth(1, list).isEmpty)
  }
}
