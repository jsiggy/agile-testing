package com.sabre.training.tdd.intro.math;

public class Fraction {
   private int numerator;

   public Fraction(int numerator) {

      this.numerator = numerator;
   }

   public Fraction plus(Fraction addend) {
      return addend;
   }

   public int intValue() {
      return this.numerator;
   }
}
