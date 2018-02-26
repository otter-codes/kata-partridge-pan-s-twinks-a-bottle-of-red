import org.scalatest.{MustMatchers, WordSpec}

class KensKataSpec extends WordSpec with MustMatchers {


  "numbers1" must {

    "return '-1' when  empty string is input" in {
      KensKata.numbers1("") mustEqual -1
    }
    "return '1' when  1 is input" in {
      KensKata.numbers1("1") mustEqual 1
    }
    "return '5' when  5 is input" in {
      KensKata.numbers1("6") mustEqual 6
    }

    }

}