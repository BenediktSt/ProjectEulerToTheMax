import DumbUtilities.SlowDumbMath.fibonacci

object P2_EvenFibonacciNumbers extends App {

  def calculate(limit: BigInt) = {
    fibonacci.takeWhile(a => a <= limit).filter(elem => elem % 2 == 0).sum
  }
  println(calculate(4000000))
}
