package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {
   @Test
   public void gcdReflexiveTests() {
      assertEquals(1, MathUtils.gcd(1, 1));
      assertEquals(2, MathUtils.gcd(2, 2));
      assertEquals(1, MathUtils.gcd(-1, -1));
   }

   @Test
   public void gcdNoCommonFactor() {
      assertEquals(1, MathUtils.gcd(4, 7));
      assertEquals(1, MathUtils.gcd(2, 3));
      assertEquals(1, MathUtils.gcd(-2, -3));
   }

   @Test
   public void gcdOneIsMultipleOfTheOther() {
      assertEquals(3, MathUtils.gcd(3, 9));
      assertEquals(5, MathUtils.gcd(5, 30));
   }

   @Test
   public void gcdCommonFactors() {
      assertEquals(2, MathUtils.gcd(6, 8));
      assertEquals(7, MathUtils.gcd(49, 315));
   }

   @Test
   public void gcdCommonFactorNegatives() {
      assertEquals(4, MathUtils.gcd(-24, -28));
      assertEquals(4, MathUtils.gcd(24, -28));
      assertEquals(4, MathUtils.gcd(-24, 28));
   }

   // exploratory tests - how does gcd deal with 0
   @Test
   public void zero() {
      assertEquals(1, MathUtils.gcd(1, 0));
      assertEquals(5, MathUtils.gcd(0, 5));
      assertEquals(0, MathUtils.gcd(0, 0));
   }
}
