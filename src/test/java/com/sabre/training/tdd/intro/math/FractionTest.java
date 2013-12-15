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
}
