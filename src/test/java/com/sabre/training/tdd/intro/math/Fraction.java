package com.sabre.training.tdd.intro.math;

public class Fraction {
   private int numerator;

   public Fraction(int numerator) {

      this.numerator = numerator;
   }

   public Fraction plus(Fraction addend) {
      if (addend.numerator != 0)
         return addend;
      else
         return this;
   }

   public int intValue() {
      return this.numerator;
   }
}
