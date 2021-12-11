object Solution_2 extends App{
  val r1 = util.Random.nextInt
  val r2 = util.Random.nextInt
  def maximum(a: Int, b: Int): Int = {
    if (a > b) a else b
  }
  def smaller(a: Int, b: Int): Int = {
    if (a > b) b else a
  }
  def secondInteger(a: Int, b: Int) = b
  println(maximum(r1,r2))
  println(smaller(r1,r2))
  println(secondInteger(r1,r2))


}
