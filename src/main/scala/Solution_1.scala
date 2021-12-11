object Solution_1 extends App{
  def max_1(a: Int, b: Int): Int = {
    if (a > b) a else b
  }
    def max_2(t: (Int, Int, Int), f: (Int, Int) => Int): Int = {
      f(t._1, f(t._2, t._3))
    }
  println(max_2((14, 7, 9), max_1))

}
