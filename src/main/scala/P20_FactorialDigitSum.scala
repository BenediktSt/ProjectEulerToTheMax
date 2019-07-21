object P20_FactorialDigitSum extends App {

  def fac(howMany : Int): BigDecimal = {
    var res = BigDecimal(1)
    for(i <- 1 to howMany)
      res *= BigDecimal(i)
    res
  }

  def calculate(howMany : Int) = fac(howMany).toString().map(_.asDigit).sum

  println(calculate(100))

}
