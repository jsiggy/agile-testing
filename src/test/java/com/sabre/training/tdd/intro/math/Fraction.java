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
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public Fraction plus(Fraction that) {
      return new Fraction(this.numerator + that.numerator, this.denominator);
   }

   public int intValue() {
      return this.numerator;
   }

   public int numerator() {
      return numerator;
   }

   public int denominator() {
      return denominator;
   }

   @Override public String toString() {
      return numerator + "/" + denominator;
   }
}
