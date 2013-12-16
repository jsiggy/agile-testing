package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {
   @Test
   public void zeroPlusZero() {
      assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
   }

   @Test
   public void zeroPlusNonZero() {
      assertEquals(3, new Fraction(0).plus(new Fraction(3)).intValue());
   }

   @Test
   public void nonZeroPlusZero() {
      assertEquals(5, new Fraction(5).plus(new Fraction(0)).intValue());
   }

   @Test
   public void nonZeroPlusNonZero() {
      assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());
   }

   @Test
   public void negativePlusNegative() {
      assertEquals(-5, new Fraction(-2).plus(new Fraction(-3)).intValue());
   }

   @Test
   public void addWithSameDenominator() {
      Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
      assertEquals(3, sum.numerator());
      assertEquals(5, sum.denominator());
   }

   @Test
   public void equalsForSameNumeratorAndDenominator() {
      assertEquals(new Fraction(3, 5), new Fraction(3, 5));
   }
}
