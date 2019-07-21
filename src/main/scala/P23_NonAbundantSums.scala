import scala.collection.mutable.ListBuffer
import util.control.Breaks._

object P23_NonAbundantSums extends App {

  def isAbundant(number: Int) = {
    DumbUtilities.SlowDumbMath.divisors(number).sum > number
  }

  def isSumOfAbundantNums(number: Int, abundants: Seq[Int]): Boolean = {
    for (i <- abundants.indices) {
      if (abundants(i) >= number) return false
      breakable {
        for (j <- abundants.indices) {
          if (abundants(j) >= number) break
          if (abundants(i) + abundants(j) == number) return true
        }
      }
    }
    false
  }

  def calculate(limit: Int) = {
    val abundants = (1 to limit).filter(isAbundant)
    val potentials = ListBuffer.empty[Int]
    for (element <- 1 to limit) {
      if (!isSumOfAbundantNums(element, abundants)) potentials += element
    }
    potentials.sum
  }

  println(calculate(28123))
}
