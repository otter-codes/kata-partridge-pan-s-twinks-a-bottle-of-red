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
    ???
  }

  def london(args: Array[String]): String = {
    ???
  }
print(part(Array("word")))
}