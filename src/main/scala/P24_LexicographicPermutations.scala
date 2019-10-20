import DumbUtilities.SlowDumbMath
import scala.collection.mutable.ListBuffer

object P24_LexicographicPermutations extends App {

  def calculate(nthLexicographicPermutation : Long) : Long = {
    val possiblePermutations = (0 to 9).toBuffer
    val targetPermutation = ListBuffer[Long]()
    var pos = 0
    var remainderOfPermutation = nthLexicographicPermutation
    for (i <- 9 to 0 by -1) {
      remainderOfPermutation -= pos * SlowDumbMath.faculties(i + 1)
      pos = (remainderOfPermutation / SlowDumbMath.faculties(i)).toInt
      targetPermutation.append(possiblePermutations.remove(pos))
    }
    targetPermutation.fold(0L)((a, b) => a * 10 + b)
  }

  print(calculate(899999))
}
