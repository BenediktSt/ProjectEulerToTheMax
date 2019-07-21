import scala.collection.mutable

object P2_EvenFibonacciNumbers extends App {

  //GPL v 2
  lazy val fibs: Stream[BigInt] = BigInt(0) #::
    BigInt(1) #::
    fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  val calculate = {
    fibs.takeWhile(a => a <= 4000000).filter(elem => elem % 2 == 0).sum
  }
  println(calculate)
}
