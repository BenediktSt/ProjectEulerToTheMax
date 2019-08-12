import org.scalatest.FlatSpec

class P2_Spec extends FlatSpec{

  "P2_EvenFibonacciNumbers" should "calculate the correct result for n = 10" in {
    assert(P2_EvenFibonacciNumbers.calculate(10) === 10)
  }

  it should "calculate the correct result for n = 100" in {
    assert(P2_EvenFibonacciNumbers.calculate(100) === 44)
  }

  it should "solve the problem" in {
    assert(P2_EvenFibonacciNumbers.calculate(4000000) === 4613732)
  }
}
