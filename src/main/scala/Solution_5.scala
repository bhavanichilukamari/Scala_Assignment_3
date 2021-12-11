object Solution_5 extends App{
  def conditional(x:Int,p:(Int => Boolean),f:(Int => Int)):Int= {
    if (p(x)) f(x) else x
  }
    def value1(a:Int):Boolean ={
      if(a*a > 8) true
      else false
    }

      def value(a:Int):Int ={
        a*a
      }
  println(conditional(10,value1,value))

  }


