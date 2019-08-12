import org.scalatest.FlatSpec

class P1_Spec extends FlatSpec{

  "P1_MultiplesOf3And5" should "calculate the correct result for n = 10" in {
    assert(P1_MultiplesOf3And5.calculate(10) === 23)
  }

  it should "calculate the correct result for n = 100" in {
    assert(P1_MultiplesOf3And5.calculate(100) === 2318)
  }

  it should "solve the problem" in {
    assert(P1_MultiplesOf3And5.calculate(1000) === 233168)
  }
}
