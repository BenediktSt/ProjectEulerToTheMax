object P28_SumSpiral extends App {

  def calculate(width : Int): Int = {
    assert(width % 2 != 0)
    if(width == 1) 1
    else 4 * width * width - 6 * width + 6 + calculate(width - 2)
  }

}
