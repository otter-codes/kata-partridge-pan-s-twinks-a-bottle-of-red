
object FizzBuzz extends App {

  def fizz1(num: String):String =  {

    val x = num.toInt

    x match{
      case  x if x%10 ==0 => "FizzBuzz"
      case  x if x%2== 0 => "Fizz"
      case  x if x%5==0  => "Buzz"
      case  _ => num

    }
  }


def fizz2(num:Int):String = {

  num match {
    case x if x % 10 == 0 => "FizzBuzz"
    case x if x % 2 == 0 => "Fizz"
    case x if x % 5 == 0 => "Buzz"
    case _ => num.toString

  }
}

}