package DumbUtilities

import org.scalatest.FlatSpec
import org.scalatest.prop.Tables.Table

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

  "SlowDumbMath.fibonacci" should "calculate the correct fibonacci number for n = 0" in {
    assert(SlowDumbMath.fibonacci.head === 0)
  }

  it should "calculte the correct fibonacci number for n = 1" in {
    assert(SlowDumbMath.fibonacci(1) === 1)
  }

  it should "calculate the correct fibonacci number for n = 7" in {
    assert(SlowDumbMath.fibonacci(7) === 13)
  }

  it should "calculate the correct fibonacci number for n = 12" in {
    assert(SlowDumbMath.fibonacci(12) === 144)
  }


}
