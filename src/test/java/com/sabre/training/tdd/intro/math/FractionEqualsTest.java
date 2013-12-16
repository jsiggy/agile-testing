package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionEqualsTest {
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
   public void negativeValuesOppositeForDenominatorAndNumerator() {
      assertEquals(new Fraction(5, -1), new Fraction(-5, 1));
      assertEquals(new Fraction(-5, 1), new Fraction(-5, 1));
      assertEquals(new Fraction(5, 1), new Fraction(-5, -1));
   }
}
