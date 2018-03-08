val divide = (x: Int) => 42 / x
List(1, 2).map(divide)
divide(2)

val dividePF = new PartialFunction[Int, Int] {

  def apply(x: Int) = 42 / x

  override def isDefinedAt(x: Int): Boolean = x != 0

}

val x = 2
// use the test in a conditionak expression

if (dividePF.isDefinedAt(x)) {
  dividePF(x)
}
else {
  println("Can't handle this")

}

val handleZeros: PartialFunction[Int, Int] = {
  case y => y
}

val dividePF2: PartialFunction[Int, Int] = {
  case y if y != 0 => 42 / y
}

val divideOrHandle = dividePF2 orElse handleZeros
// use composed function as arguments for map
List(0, 1, 2, 3, 4, 5).map(divideOrHandle)


List (0,1,2,3,4,5).collect(dividePF)
List (0,1,2,3,4,5).collect(dividePF2)// same as above

val isEven : PartialFunction[Int, String]={
  case x:Int if x% 2 ==0 => s"$x is even"
}
val isOdd : PartialFunction[Int, String]={
  case x:Int if x% 2 ==1 => s"$x is Odd"
}
val numbers = 1 to 5
val evenNumbers = numbers collect isEven

val double =(n:Int)=> n * 2
val addOne  = (n:Int) => n + 1

val doublePlusOne = double compose addOne

val nums = (1 to 28).toList
nums.map(doublePlusOne)

//compose does thing on right first and andThen does left first





