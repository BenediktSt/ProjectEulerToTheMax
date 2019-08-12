import scala.collection.mutable

object P2_EvenFibonacciNumbers extends App {

  //GPL v 2
  lazy val fibs: Stream[BigInt] = BigInt(0) #::
    BigInt(1) #::
    fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  def calculate(limit: BigInt) = {
    fibs.takeWhile(a => a <= limit).filter(elem => elem % 2 == 0).sum
  }
  println(calculate(4000000))
}
