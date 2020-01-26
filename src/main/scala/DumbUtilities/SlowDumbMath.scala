package DumbUtilities

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object SlowDumbMath {

  def divisors(number: Double): mutable.Seq[Double] = {
    val divisors = ListBuffer(1.0)
    for (i <- 2 to Math.sqrt(number).toInt) {
      if (number % i == 0) {
        divisors += i
        if (i != number / i) divisors += number / i
      }
    }
    divisors
  }

  def isPrime(n: Double): Boolean = {
    n match {
      case v if v <= 3 => v > 1
      case v if v % 2 == 0 || v % 3 == 0 => false
      case _ =>
        var i = 5
        while (i * i <= n) {
          if (n % i == 0 || n % (i + 2) == 0)
            return false
          i = i + 6
        }
        true
    }
  }

  private val facultyCalculation: LazyList[(Long, Int)] = (1L, 0) #:: facultyCalculation.map { e => (e._1 * (e._2 + 1), e._2 + 1) }

  def faculties(index: Int): Long = facultyCalculation(index)._1

  val fibonacci: LazyList[BigInt] = BigInt(0) #:: BigInt(1) #:: fibonacci.zip(fibonacci.tail).map { e => e._1 + e._2 }

}
