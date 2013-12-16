package com.sabre.training.tdd.intro.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {
   @Test
   public void reflexiveTests() {
      assertEquals(1, gcd(1, 1));
      assertEquals(2, gcd(2, 2));
      assertEquals(-1, gcd(-1, -1));
   }

   private int gcd(int a, int b) {
      while (b != 0) {
         int t = b;
         b = a % t;
         a = t;
      }
      return a;
   }
}
