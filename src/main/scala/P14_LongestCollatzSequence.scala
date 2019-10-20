import DumbUtilities.DumbGenerator

object P14_LongestCollatzSequence extends App {

  def getSequenceLength(in : Double) = {
    val collatz = new DumbGenerator[Double]( in, n => { if (n % 2 == 0) n / 2 else 3 * n + 1 } )

    var len = 1
    var current = in
    while ( current != 1 ) {
      current = collatz.next()
      len += 1
    }
    len
  }

  def calculate(in : Int) = {
    var max = 0
    var startingIndexForTheMaximumValue = 0
    for(i <- 1 to in) {
      val sequenceLength = getSequenceLength(i)
      if(sequenceLength > max) {
        max = sequenceLength
        startingIndexForTheMaximumValue = i
      }
    }
    startingIndexForTheMaximumValue
  }
  println(calculate(1000000))
}
