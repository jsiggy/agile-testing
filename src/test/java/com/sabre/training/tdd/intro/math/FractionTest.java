package com.sabre.training.tdd.intro.math;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

   // equals
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

   // addition
   @Test
   public void zeroPlusZero() {
      assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
   }

   @Test
   public void zeroPlusNonZero() {
      assertEquals(new Fraction(3), new Fraction(0).plus(new Fraction(3)));
   }

   @Test
   public void nonZeroPlusZero() {
      assertEquals(new Fraction(5), new Fraction(5).plus(new Fraction(0)));
   }

   @Test
   public void nonZeroPlusNonZero() {
      assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
   }

   @Test
   public void negativePlusNegative() {
      assertEquals(new Fraction(-5), new Fraction(-2).plus(new Fraction(-3)));
   }

   @Test
   public void addWithSameDenominator() {
      assertEquals(new Fraction(3, 5), new Fraction(1, 5).plus(new Fraction(2, 5)));
   }

   @Test
   public void addWithDifferentDenominatorsNoReduction() {
      assertEquals(new Fraction(5, 6), new Fraction(1, 2).plus(new Fraction(1, 3)));
   }

   @Test
   public void reduceResultToWholeNumber() {
      assertEquals(new Fraction(1), new Fraction(1, 3).plus(new Fraction(2, 3)));
   }

   @Test
   public void oneFactorIsAMultipleOfTheOther() {
      assertEquals(new Fraction(11, 8), new Fraction(3, 4).plus(new Fraction(5, 8)));
   }

   @Test
   public void commonFactorsInDenominators() {
      assertEquals(new Fraction(11, 18), new Fraction(1, 6).plus(new Fraction(4, 9)));
   }

   @Test
   public void reduceResultsEvenWhenDenominatorsAreTheSame() {
      assertEquals(new Fraction(3, 2), new Fraction(3, 4).plus(new Fraction(3, 4)));
   }

   @Test
   public void negativeFractionIsReducing() {
      assertEquals(new Fraction(1, 2), new Fraction(-1, 4).plus(new Fraction(3, 4)));
      assertEquals(new Fraction(-1, 8), new Fraction(3, 8).plus(new Fraction(-1, 2)));
   }

   @Test
   @Ignore("Waiting on special case handling for gcd")
   public void reduceToNegativeNumeratorAndDenominator() {
      assertEquals(new Fraction(1, 2), new Fraction(-1, 4).plus(new Fraction(-3, -4)));
   }

   // reduce
   @Test
   public void reduceWhenAlreadyInLowestTerms() {
      assertEquals(new Fraction(3, 4), new Fraction(3, 4));
   }

   @Test
   public void reduceToNotWholeNumber() {
      assertEquals(new Fraction(3, 4), new Fraction(6, 8));
   }

   @Test
   public void reduceToWholeNumber() {
      assertEquals(new Fraction(6), new Fraction(24, 4));
   }

   @Test
   public void reduceForZero() {
      assertEquals(new Fraction(0), new Fraction(0, 19293));
   }
}
