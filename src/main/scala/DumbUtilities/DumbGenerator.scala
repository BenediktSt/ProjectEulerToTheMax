package DumbUtilities

class DumbGenerator[T]( var init : T, generator : T => T) {

  def next() : T = {
    init = generator(init)
    init
  }

}
