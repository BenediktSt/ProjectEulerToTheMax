object P26_ReciprocalCycles extends App {

  /**
    * @note   Does not work if initial numerator != 1, that's why it's private lul
    * @return The reciprocal of numerator divided by denominator
    */
  private def reciprocalCycle(numerator : Int,  denominator : Int, untilNow : Seq[(Int, Int)]): Seq[Int] = {

    val remainder = numerator % denominator
    val result = numerator / denominator

    remainder match {
      case 0 => Seq(result)
      case _ =>
        if(untilNow.contains((result, remainder))) {
          Seq()
        }
        else {
          val nextReciprocal = reciprocalCycle(remainder * 10, denominator, untilNow ++ Seq((result, remainder)))
          Seq(result) ++ nextReciprocal
        }
    }
  }

  def reciprocalCycle(denominator : Int) : Seq[Int] = reciprocalCycle(1, denominator, Seq[(Int, Int)]())

  def calculate(length: Int) = {
    var max = Seq.empty[Int]
    val larger = (a: Seq[Int], b : Seq[Int]) => if( a.size > b.size) a else b

    for(i <- 2 until length) {
      max = larger(max, reciprocalCycle(i))
    }
    max.size
  }

  println(calculate(8))
  println(calculate(1000))

}
