package com.bnb.service;

public class BNBookOrderService {
   public boolean placeOrder(BNOrder order) {
      System.out.println("calling BNB Book Service for " + order.getAmount() + " units of " + order.getProduct().getName());
      return order.getAmount() < 100;
   }
}
