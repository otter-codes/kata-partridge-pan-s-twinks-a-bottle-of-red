object Partridge extends App {

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {
    ???
  }

  def apple(x: Any): String = {
    ???
  }

  def london(args: Array[String]): String = {

    val londonSet = Set("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")

    if (londonSet.subsetOf(args.toSet)){

      "Smell my cheese you mother!"

    }

    else {

      "No, seriously, run. You will miss it."

    }

  }

  val userArray = Array("Norwich", "Tooting", "Bank",
    "Rejection", "Disappointment", "Backstabbing Central",
    "Exeter", "Shattered Dreams Parkway", "Belgium","London")
  println(london(userArray))

}