object Solution_3 extends App{

  def product(i: Int): Int =
  { i * 3 }
  def func(i: Int , f:Int => Int ) =
    {f(i)}
  println(func(5,product))
}
