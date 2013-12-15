package com.sabre.training.tdd.intro.math;

public class Fraction {
   private int numerator;

   public Fraction(int numerator) {

      this.numerator = numerator;
   }

   public Fraction plus(Fraction that) {
      if (that.numerator != 0)
         return that;
      else
         return this;
   }

   public int intValue() {
      return this.numerator;
   }
}
