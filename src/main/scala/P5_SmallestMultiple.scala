object P5_SmallestMultiple extends App {

  val until = 20

  val Oneto20 = 1 to 20

  def divisible(in : Int) : Boolean = Oneto20.map(in % _ == 0).reduce((a, b) => a && b)

  def calculate() : Int = {
    var init = 1
    while (!divisible(init))
      init += 1
    init
  }

  println(calculate())
}
