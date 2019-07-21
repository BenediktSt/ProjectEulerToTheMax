object P6_SumSquareDifference extends App {

  def calculate (max : Int): Double = {
    val sumOfSquares = (1 to max).map(Math.pow(_, 2)).sum
    val squareOfSum = Math.pow((1 to max).sum, 2)
    Math.abs(sumOfSquares - squareOfSum)
  }

  println(calculate(100))

}
