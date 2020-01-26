import DumbUtilities.SlowDumbMath

object P25_1000Fib extends App {

  def numDigits(bigInt: BigInt): Int = {
    bigInt.toString().length
  }

  def calculate(n : Int) = SlowDumbMath.fibonacci.takeWhile(numDigits(_) < n).length

}
