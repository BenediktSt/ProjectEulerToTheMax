import org.scalatest.FlatSpec

class P3_Spec extends FlatSpec{

  "P3_LargestPrimeFactor" should "calculate the correct result for n = 13195" in {
    assert(29 === P3_LargestPrimeFactor.calculate(13195.0))
  }

  it should "solve the problem" in {
    assert(6857 === P3_LargestPrimeFactor.calculate(600851475143.0))
  }
}

