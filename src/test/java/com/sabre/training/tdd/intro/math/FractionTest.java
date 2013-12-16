package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {
   @Test
   public void equalsForSameNumeratorAndDenominator() {
      assertEquals(new Fraction(3, 5), new Fraction(3, 5));
   }

   @Test
   public void notEqualsForDifferentNumeratorAndSameDenominator() {
      assertNotEquals(new Fraction(2, 5), new Fraction(4, 5));
   }

   @Test
   public void notEqualsForSameNumeratorAndDifferentDenominator() {
      assertNotEquals(new Fraction(1, 3), new Fraction(1, 5));
   }

   @Test
   public void wholeNumberEqualsSameFraction() {
      assertEquals(new Fraction(5), new Fraction(5, 1));
   }

   @Test
   public void zeroPlusZero() {
      assertEquals(0, new Fraction(0).plus(new Fraction(0)).numerator());
   }

   @Test
   public void zeroPlusNonZero() {
      assertEquals(3, new Fraction(0).plus(new Fraction(3)).numerator());
   }

   @Test
   public void nonZeroPlusZero() {
      assertEquals(5, new Fraction(5).plus(new Fraction(0)).numerator());
   }

   @Test
   public void nonZeroPlusNonZero() {
      assertEquals(7, new Fraction(3).plus(new Fraction(4)).numerator());
   }

   @Test
   public void negativePlusNegative() {
      Fraction fraction = new Fraction(-2).plus(new Fraction(-3));
      assertEquals(-5, fraction.numerator());
   }

   @Test
   public void addWithSameDenominator() {
      Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
      assertEquals(3, sum.numerator());
      assertEquals(5, sum.denominator());
   }
}
