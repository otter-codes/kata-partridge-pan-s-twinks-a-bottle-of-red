import org.scalatest.{MustMatchers, WordSpec}

class FizzBuzzSpec extends WordSpec with MustMatchers {

  "FizzBuzz" when {

    "fizz1 is called" must {


      "return 'fizz' when andeven number is input" in {

        FizzBuzz.fizz1("2") mustEqual "Fizz"
      }
      "return 'buzz' when a number divisible by 5 is input" in {

        FizzBuzz.fizz1("5") mustEqual "Buzz"
      }
      "return 'FizzBuzz' when a number divisible by 10 is input" in {

        FizzBuzz.fizz1("10") mustEqual "FizzBuzz"
      }
      "return 'number' when a number input is not divisible by 2 or 5" in {

        FizzBuzz.fizz1("3") mustEqual "3"
      }
    }


    "fizz2 is called" must {


      "return 'fizz' when an even number is input" in {

        FizzBuzz.fizz2(2) mustEqual "Fizz"
      }
      "return 'buzz' when a number divisible by 5 is input" in {

        FizzBuzz.fizz2(5) mustEqual "Buzz"
      }
      "return 'FizzBuzz' when a number divisible by 10 is input" in {

        FizzBuzz.fizz2(10) mustEqual "FizzBuzz"
      }
      "return 'number' when a number input is not divisible by 2 or 5" in {

        FizzBuzz.fizz2(3) mustEqual "3"
      }
    }
  }


}
