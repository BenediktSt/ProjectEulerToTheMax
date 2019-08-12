object P1_MultiplesOf3And5 extends App {

  def calculate(limit: Int) = (1 until limit).filter(i => i % 3 == 0 || i % 5 == 0).sum

  println(calculate(1000))

}
