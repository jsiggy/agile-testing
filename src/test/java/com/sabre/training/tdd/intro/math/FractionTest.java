package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {
   @Test
   public void zeroPlusZero() {
      assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
   }

   @Test
   public void zeroPlusNonZero() {
      Fraction sum = new Fraction(0).plus(new Fraction(3));
      assertEquals(3, sum.intValue());
   }

   @Test
   public void nonZeroPlusZero() {
      Fraction first = new Fraction(5);
      Fraction second = new Fraction(0);

      Fraction sum = first.plus(second);

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
