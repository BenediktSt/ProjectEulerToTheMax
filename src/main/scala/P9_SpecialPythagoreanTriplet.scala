object P9_SpecialPythagoreanTriplet extends App {

  def calculate (): Any = {

    for(a <- 1 to 1000) {
      for(b <- a to 1000) {
        for(c <- b to 1000) {
          if(a * a + b * b == c * c && a + b + c == 1000) return (a, b, c)
        }
      }
    }
  }

  println(calculate())

}
