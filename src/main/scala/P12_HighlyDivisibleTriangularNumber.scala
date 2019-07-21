import DumbUtilities.SlowDumbMath

import scala.collection.mutable.ListBuffer

object P12_HighlyDivisibleTriangularNumber extends App {

  def calculate(numberOfDivisors: Int): Int = {
    var counter = 1
    while (SlowDumbMath.divisors((1 to counter).sum).length < numberOfDivisors) {
      counter += 1
    }
    (1 to counter).sum
  }

  println(calculate(500))
}
