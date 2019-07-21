import scala.collection.mutable.ListBuffer

object P24_LexicographicPermutations extends App {

  def next(number : Int, numbers: Seq[Int]) : Option[Int]  = {
    numbers.indexOf(number) match {
      case v if v != -1 && v + 1 < numbers.length => Option(numbers(v + 1))
      case v if v != -1 && v + 1 == numbers.length => Option(numbers.head)
      case _ => None
    }

  }

  def nextPermutation(permutation : Seq[Int], numbers : Seq[Int]): Seq[Int] = {
    var res : ListBuffer[Int] = ListBuffer.empty
    res ++= permutation
    for(i <- res.indices) {
      next(res(i), numbers) match {
        case Some(value) =>


          res(i) = value
          if(value != numbers.head) return res
        case None =>
      }
    }
    res
  }
//
//  def generatePermutations(numbers : Set[Int] ) = {
//
//    def x = ( Permutation, number ) => (   Permutation + 1, numbers)
//
//
//  }

    println( next(2, Seq(1,2,7,9)).get )
    println( next(9, Seq(1,2,7,9)).get )
    println( nextPermutation( Seq(1,2,7,9) , Seq(1,2,7,9)) )


}
