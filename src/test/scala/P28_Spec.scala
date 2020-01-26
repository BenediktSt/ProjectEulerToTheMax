import org.scalatest.FlatSpec

class P28_Spec extends FlatSpec{

  "P28_SumSpiral" should "calculate the correct result for n = 5" in {
    assert(P28_SumSpiral.calculate(5) == 101)
  }

  "P28_SumSpiral" should "calculate the correct result for n = 7" in {
    assert(P28_SumSpiral.calculate(7) == 261)
  }

  "P28_SumSpiral" should "calculate the correct result for n = 1001" in {
    assert(P28_SumSpiral.calculate(1001) == 669171001)
  }

  it should "fail for even width" in {

      intercept[AssertionError] {
        P28_SumSpiral.calculate(2)
      }
  }


}
