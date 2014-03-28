package com.bnb.service;

public class BNOrder {
   private BNProduct product;
   private int amount;

   public BNProduct getProduct() {
      return product;
   }

   public void setProduct(BNProduct product) {
      this.product = product;
   }

   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }
}
