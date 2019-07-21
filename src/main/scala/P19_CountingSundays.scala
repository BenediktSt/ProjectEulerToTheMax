object P19_CountingSundays extends App {

  def getDaysOfMonth(month: Integer, year: Int): Int = {
    month match {
      case _ if Array(4, 6, 9, 11).contains(month) => 30
      case _ if Array(1, 3, 5, 7, 8, 10, 12).contains(month) => 31
      case _ => if (isLeapYear(year)) 29 else 28
    }
  }

  def isLeapYear(year: Int): Boolean = {
    year match {
      case _ if year % 400 == 0 => true
      case _ if year % 100 == 0 => false
      case _ if year % 4 == 0 => true
      case _ => false
    }
  }

  def getDayByYear(year: Int): Int = (1900 until year).map(y => if (isLeapYear(y)) 366 else 365).sum

  def calculate(startYear: Int, endYear: Int): Int = {
    var currentDay = getDayByYear(startYear)
    var sundays = 0
    for (i <- 1 to 12 * (endYear - startYear +1)) {
      if (currentDay % 7 == 6) sundays += 1
      currentDay += getDaysOfMonth(i % 12 + 1, startYear + i % 12)
    }
    sundays
  }

  println(calculate(1901, 2000))

}
