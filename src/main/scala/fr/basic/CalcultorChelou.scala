package fr.basic

class CalculatorChelou(a: Int) {
  def ~+~(b: Int) = b
  match {
    case 1 => None
    case _ => Some(a + a + b)

  }
}

object CalcultorChelou {
  implicit def fromIntToCalculatorChelou(a: Int) : CalculatorChelou =
    new CalculatorChelou(a)

}


