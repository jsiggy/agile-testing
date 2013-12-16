package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionReduceTest {
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
