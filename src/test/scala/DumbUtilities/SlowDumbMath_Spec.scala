package DumbUtilities

import org.scalatest.FlatSpec

class SlowDumbMath_Spec extends FlatSpec {

  "SlowDumbMath.faculties" should "calculate the correct faculty for n = 0" in {
    assert(SlowDumbMath.faculties(0) === 1)
  }

  it should "calculate the correct faculty for n = 1" in {
    assert(SlowDumbMath.faculties(1) === 1)
  }

  it should "calculate the correct faculty for n = 2" in {
    assert(SlowDumbMath.faculties(2) === 2)
  }

  it should "calculate the correct faculty for n = 10" in {
    assert(SlowDumbMath.faculties(10) === 3628800)
  }

}
