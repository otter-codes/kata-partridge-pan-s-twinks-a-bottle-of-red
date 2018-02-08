object Partridge extends App {

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {

    val quoteSet = Set("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val q = args.filter((i: String) => quoteSet contains i).toList.length
    //(s"${q}")
    if(q== 0){
      "Lynn, I've pierced my foot on a spike!!"
    } else {
      s"Mine's a pint${"!" * q}"
    }
  }
  def apple(x: Any): String = {
    val b = x.toString.toInt
    if (b * b <= 1000) {
      "Help yourself to a honeycomb Yorkie for the glovebox."
    }
    else "It's hotter than the sun!!"
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
