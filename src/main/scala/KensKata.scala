import java.lang
import java.io.IOException
import java.lang.NumberFormatException


import scala.io.StdIn

import scala.util.{Failure, Success, Try}


object KensKata extends  App {

  val firstNumber = StdIn.readLine("Please enter first number")
  val secondNumber = StdIn.readLine("Please enter second number")

 /*def numbersToInt ( nums:String):Any= {
   try {
     nums.toInt
   } catch {
     case e: NumberFormatException => "Enter another number"
   }
 }
 */
  /*
 def toInt(s: String):Option[Int] = {
   try {
     Some(s.toInt)
   } catch {
     case e: NumberFormatException => None
   }
 }
      case Failure (NumberFormatException) =>
        println("Enter another number")
      }
*/

  def numbers1( nums3: String ): Int = {
    nums3 match {
      case "" => -1
      case _ => nums3.toInt
    }
  }
  def division( number1: Int, number2: Int ): String = {
    val result = numbers1(firstNumber) / numbers1(secondNumber)
    val remainder = numbers1(firstNumber) % numbers1(secondNumber)

    s"Number $firstNumber divided by $secondNumber is $result and has remainder $remainder"

  }
  println(division(numbers1(firstNumber),numbers1( secondNumber)))

}
