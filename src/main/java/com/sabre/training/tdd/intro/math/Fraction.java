package com.sabre.training.tdd.intro.math;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Fraction {
   private final int numerator;
   private final int denominator;

   public Fraction(int numerator) {
      this(numerator, 1);
   }

   public Fraction(int numerator, int denominator) {
      int signOfDenominator = denominator < 0 ? -1 : 1;
      int gcd = MathUtils.gcd(numerator, denominator) * signOfDenominator;
      this.numerator = numerator / gcd;
      this.denominator = denominator / gcd;
   }

   public Fraction plus(Fraction that) {
      return new Fraction(this.numerator * that.denominator + this.denominator * that.numerator,
         this.denominator * that.denominator);
   }

   @Override public String toString() {
      return numerator + "/" + denominator;
   }
}
