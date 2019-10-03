import org.scalatest.FlatSpec

class P4_Spec extends FlatSpec {

  "P4_LargestPalindromeProduct" should "calculate the correct result for two digits" in {
    assert(9009 === P4_LargestPalindromeProduct.calculate(99))
  }

  it should "solve the problem" in {
    assert(906609 === P4_LargestPalindromeProduct.calculate(999))
  }
}
