
import KensKata.{firstNumber, num1, secondNumber}

import scala.io.StdIn
import scala.util.{Failure, Success, Try}
object KensKata extends  App {

  val firstNumber = num1(StdIn.readLine("Please enter first number"))
  val secondNumber = num1(StdIn.readLine("Please enter second number"))

  def num1( nums: String ) = Try(nums.toString.toInt) match {
    case Success(x) => x
    case Failure(e) => 0  }

  println(division(firstNumber, secondNumber))

  def division( no1: Int, no2: Int ): Unit = {
    if ((no1 == 0) || (no2 == 0)) {
      println("You did not enter a valid number!!!")
      playAgain

    } else {
      val result = no1 / no2
      val remainder = no1 % no2
      println(s"Number $no1 divided by $no2 is $result and has remainder $remainder")
    }
  }

  def playAgain():Unit ={
    val firstNum = num1(StdIn.readLine("Please enter first number"))
    val secondNum = num1(StdIn.readLine("Please enter second number"))
    println(division(firstNum, secondNum))
  }


}

