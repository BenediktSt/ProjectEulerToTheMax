object P21_AmicableNumbers extends App {

  def calculate(limit: Int): Double = {
    var sum = 0.0 //Q.E.D.
    for (i <- 1 to limit) {
      val potAmicable = DumbUtilities.SlowDumbMath.divisors(i).sum
      if (potAmicable != i && potAmicable <= limit && DumbUtilities.SlowDumbMath.divisors(potAmicable).sum == i) sum += i
    }
    sum
  }

  println(calculate(100000))

}
