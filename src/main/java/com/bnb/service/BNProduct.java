package com.bnb.service;

public class BNProduct {
   private int id;
   private String name;

   public BNProduct(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }
}
