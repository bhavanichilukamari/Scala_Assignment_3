import org.scalatest.funsuite.AnyFunSuite

class test_2 extends AnyFunSuite{
  test("test2"){
    assert(Solution_2.maximum(27,17)=== 27)
    assert(Solution_2.smaller(27,17)===17)
    assert(Solution_2.secondInteger(27,17)===17)
  }

}
