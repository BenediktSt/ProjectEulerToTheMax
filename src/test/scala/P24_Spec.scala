import org.scalatest.FlatSpec

class P24_Spec extends FlatSpec{

  "P24_LexicographicPermutations" should "calculate the correct result for n = 699999" in {
    assert(1938246570L === P24_LexicographicPermutations.calculate(699999))
  }

  it should "calculate the correct result for n=899999" in {
    assert(2536987410L === P24_LexicographicPermutations.calculate(899999))
  }

  it should "calculate the correct result for n=900" in {
    assert(2537014689L === P24_LexicographicPermutations.calculate(900000))
  }

  it should "solve the problem" in {
    assert(2783915460L === P24_LexicographicPermutations.calculate(999999))
  }

}
