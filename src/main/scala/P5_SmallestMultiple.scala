object P5_SmallestMultiple extends App {

  def divisible(n: Int, in : Int) : Boolean = (1 to n).map(in % _ == 0).reduce((a, b) => a && b)

  def calculate(n: Int) : Int = {
    var init = 1
    while (!divisible(n, init))
      init += 1
    init
  }

  println(calculate(7))
}
