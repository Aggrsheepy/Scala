import org.scalatest.FunSuite

class hw1test extends FunSuite {
  test ("hw1.d") {
    assert(hw1.div(3,100) === Vector(3, 6, 7, 9, 12, 14, 15, 18, 21))
  }
}
