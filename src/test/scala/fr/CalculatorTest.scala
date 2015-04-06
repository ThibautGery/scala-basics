package fr

import fr.basic.CalculatorChelou
import fr.basic.CalcultorChelou.fromIntToCalculatorChelou

import org.specs2._

class CalculatorTest extends mutable.SpecificationWithJUnit {
  "Le plus chelou" should {
    "revoit 7 avec 2 + 3" in {
      2 ~+~ 3 must beSome(7)
    }
    "revoit 8 avec 3 + 2" in {
      3 ~+~ 2 must beSome(8)
    }
    "revoit rien avec 3 + 1" in {
      3 ~+~ 1 must beNone
    }
  }
}

