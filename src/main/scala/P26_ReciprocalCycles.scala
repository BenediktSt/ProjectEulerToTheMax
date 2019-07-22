object P26_ReciprocalCycles extends App {

  /**
    * @note   Does not work if initial numerator != 1, that's why it's private lul
    * @return The reciprocal's cycle length of it's recurring part as well as the reciprocal itself
    */
  private def reciprocalCycle(numerator : Int,  denominator : Int, untilNow : Seq[(Int, Int)]): (Int, Seq[Int]) = {

    val remainder = numerator % denominator
    val result = numerator / denominator

    remainder match {
      case 0 => (0, Seq(result))
      case _ =>
        if(untilNow.contains((result, remainder))) {
          (untilNow.length - 1, Seq())
        }
        else {
          val nextReciprocal = reciprocalCycle(remainder * 10, denominator, untilNow ++ Seq((result, remainder)))
          (nextReciprocal._1, Seq(result) ++ nextReciprocal._2)
        }
    }
  }

  def reciprocalCycle(denominator : Int) : (Int, Seq[Int]) = reciprocalCycle(1, denominator, Seq[(Int, Int)]())

  def calculate(length: Int) = {
    var max = (0, Seq.empty[Int])
    val larger = (a: (Int, Seq[Int]), b : (Int, Seq[Int])) => if( a._1 > b._1) a else b

    for(i <- 2 until length) {
      max = larger(max, reciprocalCycle(i))
    }
    max
  }

  println(calculate(8))
  println(calculate(1000))

}
