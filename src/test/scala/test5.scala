import Solution_5.{value, value1}
import org.scalatest.funsuite.AnyFunSuite

class test5 extends AnyFunSuite{
  test("test5"){
    assert(Solution_5.conditional(10,Solution_5.value1,Solution_5.value) === 100)
  }

}
