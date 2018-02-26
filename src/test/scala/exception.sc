
  import scala.io._
  def numbersToInt ( nums: String ):Any = {
    try {
      nums.toInt
    }
    catch {
      case e: NumberFormatException => {
        "Enter another number"
      }

    }

  }
 /*   nums match {

      case "" => -1

      case _ => nums.toInt
    }
  }
  */
  numbersToInt("2")
numbersToInt("two")

