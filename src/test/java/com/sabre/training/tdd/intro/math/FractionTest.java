package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {
   @Test
   public void zeroPlusZero() {
      Fraction sum = new Fraction(0).plus(new Fraction(0));
      assertEquals(0, sum.intValue());
   }

   @Test
   public void zeroPlusNonZero() {
      Fraction sum = new Fraction(0).plus(new Fraction(3));
      assertEquals(3, sum.intValue());
   }

   @Test
   public void nonZeroPlusZero() {
      Fraction sum = new Fraction(5).plus(new Fraction(0));
      assertEquals(5, sum.intValue());
   }

   @Test
   public void nonZeroPlusNonZero() {
      Fraction sum = new Fraction(3).plus(new Fraction(4));
      assertEquals(7, sum.intValue());
   }

   @Test
   public void negativePlusNegative() {
      Fraction sum = new Fraction(-2).plus(new Fraction(-3));
      assertEquals(-5, sum.intValue());
   }
}
