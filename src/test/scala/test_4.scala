import org.scalatest.funsuite.AnyFunSuite

class test_4 extends AnyFunSuite{
  test("test4"){
    assert(Solution_4.multiplyBY2(Solution_4.add2(2)) === 8)
  }

}
