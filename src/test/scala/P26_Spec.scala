import org.scalatest.FlatSpec

class P26_Spec extends FlatSpec{

  "P26_ReciprocalCycles" should "calculate the correct result for n = 700" in {
    assert(659 === P26_ReciprocalCycles.calculate(700))
  }

  it should "calculate the correct result for n=800" in {
    assert(743 === P26_ReciprocalCycles.calculate(800))
  }

  it should "calculate the correct result for n=900" in {
    assert(887 === P26_ReciprocalCycles.calculate(900))
  }

  it should "solve the problem" in {
    assert(983 === P26_ReciprocalCycles.calculate(1000))
  }

}
