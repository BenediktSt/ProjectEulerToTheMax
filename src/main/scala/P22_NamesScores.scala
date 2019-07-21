import scala.io.Source

object P22_NamesScores extends App {

  val filename = "resources/p022_names.txt"

  /**
    * @return c's position in the alphabet if it's a letter or None if it isn't
    */
  def alphabetPosition(c : Char) : Option[Int] = {
    c.toLower match {
      case letter if letter.toInt >= 97 && letter.toInt <= 122 => Option(letter.toInt - 96)
      case _ => None
    }
  }

  def nameScore(name : String, index : Int) : Int = name.toCharArray.map(alphabetPosition(_).get).sum * index

  val calculate: Int = {
    val source = Source.fromFile(filename)
    var sum = 0
    for (line <- source.getLines) {
      sum += line.replaceAllLiterally("\"", "").split(',').sorted.zipWithIndex.map { case (name, index) => nameScore(name, index + 1)}.sum
    }
    sum
  }


  println(calculate)
}
