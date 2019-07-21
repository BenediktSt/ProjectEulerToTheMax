object P1_MultiplesOf3And5 extends App {

  def calculate() = (1 to 999).filter(i => i % 3 == 0 || i % 5 == 0).sum

  println(calculate())

}
