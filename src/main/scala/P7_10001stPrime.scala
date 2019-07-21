object P7_10001stPrime extends App{

  def isPrime(n : Long) : Boolean = {
    n match {
      case v if v <= 3 => v > 1
      case v if v % 2 == 0 || v % 3 == 0 => false
      case _ =>
        var i = 5
        while (i * i <= n) {
          if (n % i == 0 || n % (i + 2) == 0)
            return false
          i = i + 6
        }
        true
    }
  }

  def nextPrime(in : Int) : Int = {
    var init = in + 1
    while (!isPrime(init))
      init += 1
    init
  }

  def calculate(in : Int) : Int = {
    var primes = 0
    var init = 1
    while(primes != in) {
      init = nextPrime(init)
      primes += 1
    }
    init
  }

  println(calculate(10001))

}
