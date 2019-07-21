import DumbUtilities.SlowDumbMath

object P3_LargestPrimeFactor extends App {

  def calculate(input : Double) = SlowDumbMath.divisors(input).filter(SlowDumbMath.isPrime)

  println(calculate(6.0))
  println(calculate(600851475143.0))

}
