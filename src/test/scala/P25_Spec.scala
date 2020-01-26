import org.scalatest.FlatSpec

class P25_Spec extends FlatSpec {

  "numDigits" should "return the correct number of digits for n = 10" in {
    assert(P25_1000Fib.numDigits(10) === 2)
  }

  it should "return the correct number of digits for n = large" in {
    assert(P25_1000Fib.numDigits(BigInt.int2bigInt(10).pow(999)) === 1000)
  }

  "P25_1000Fib" should "calculte the correct result for digit count = 2" in {
    assert(P25_1000Fib.calculate(2) === 7)
  }

  it should "calculte the correct result for digit count = 3" in {
    assert(P25_1000Fib.calculate(3) === 12)
  }

}
