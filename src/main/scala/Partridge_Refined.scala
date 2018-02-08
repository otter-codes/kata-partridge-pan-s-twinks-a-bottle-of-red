object Partridge_Refined extends App {

  def part(args: Array[String]): String = {
    val quoteSet = Set("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val q = args.filter((i: String) => quoteSet contains i).toList.length
    if (q == 0) {"Lynn, I've pierced my foot on a spike!!"}
    else {s"Mine's a pint${"!" * q}"}
  }

  def apple(x: Any): String = {
    val b = x.toString.toInt
    if (b * b > 1000) {"It's hotter than the sun!!"}
    else { "Help yourself to a honeycomb Yorkie for the glovebox."}
  }

  def london(args: Array[String]): String = {
    val londonSet = Set("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")
    if (londonSet.subsetOf(args.toSet)) {"Smell my cheese you mother!"}
    else {"No, seriously, run. You will miss it."}
  }
}