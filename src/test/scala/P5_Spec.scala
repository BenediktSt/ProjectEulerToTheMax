import org.scalatest.FlatSpec

class P5_Spec extends FlatSpec {

  "P5_SmallesMultiple" should "calculate the correct result for n = 5" in {
    assert(60 === P5_SmallestMultiple.calculate(5))
  }

  it should "calculate the correct result for n=7" in {
    assert(420 === P5_SmallestMultiple.calculate(7))
  }

  it should "solve the problem" in {
    assert(232792560 === P5_SmallestMultiple.calculate(20))
  }

}
