object P4_LargestPalindromeProduct extends App{

  def calculate(limit: Int): Int ={
    var largest = 0
    for (i <- 1 to limit) {
      for (j <- 1 to limit) {
        val product = i * j
          val productString = product.toString
        if (productString == productString.reverse && product > largest) {
          largest = product
        }
      }
    }
    largest
  }

  println(calculate(999))

}
