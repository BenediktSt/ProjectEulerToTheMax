object P4_LargestPalindromeProduct extends App{

  val calculate: Int ={
    var largest = 0
    for (i <- 1 to 999) {
      for (j <- 1 to 999) {
        val product = i * j
          val productString = product.toString
        if (productString == productString.reverse && product > largest) {
          largest = product
        }
      }
    }
    largest
  }

  println(calculate)

}
