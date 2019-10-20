import org.scalatest.FlatSpec

class P14_Spec extends FlatSpec {

  "P14_LongestCollatzSequence" should "calculate the correct result for statring number=14" in {
    assert(9 === P14_LongestCollatzSequence.calculate(14))
  }

  "P14_LongestCollatzSequence" should "calculate the correct result for statring number=5847" in {
    assert(3711 === P14_LongestCollatzSequence.calculate(5847))
  }

  "P14_LongestCollatzSequence" should "calculate the correct result for statring number=46500" in {
    assert(35655 === P14_LongestCollatzSequence.calculate(46500))
  }

  "P14_LongestCollatzSequence" should "calculate the correct result for statring number=54512" in {
    assert(52527 === P14_LongestCollatzSequence.calculate(54512))
  }

  "P14_LongestCollatzSequence" should "calculate the correct result for statring number=1000000" in {
    assert(837799 === P14_LongestCollatzSequence.calculate(1000000))
  }

}
