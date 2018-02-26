import scala.io.StdIn
object KensKata extends  App {
  val firstNumber = StdIn.readLine("Please enter first number")
  val secondNumber = StdIn.readLine("Please enter second number")
  def num1( nums: String ): Int = {
    nums match {
      case "" => -1
      case _ => nums.toInt
    }
  }
    def division( no1: Int, no2: Int ): String = {
      if ((num1(firstNumber) == -1) || (num1(secondNumber) == -1)) {
        "You did not enter a valid number!!!"
      } else {
        val result = num1(firstNumber) / num1(secondNumber)
        val remainder = num1(firstNumber) % num1(secondNumber)
        s"Number $firstNumber divided by $secondNumber is $result and has remainder $remainder"
      }
    }
      println(division(num1(firstNumber), num1(secondNumber)))
}