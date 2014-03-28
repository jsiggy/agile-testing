package com.sabre.training.tdd.intro.order;

import com.amazon.service.AmazonBookService;
import com.amazon.service.InvalidAmazonProductAmountException;
import com.amazon.service.InvalidAmazonProductIdException;

public class OrderService {

   private AmazonBookService amazonBookService = new AmazonBookService();

   public boolean order(String productId, int amountOfProduct) {
      try {
         return amazonBookService.placeOrder(productId, amountOfProduct);
      } catch (InvalidAmazonProductIdException e) {
         throw new UnknownProductIdException("Bad product id " + productId, e);
      } catch (InvalidAmazonProductAmountException e) {
         System.out.println("**** Invalid amount requested");
      }
      return false;
   }

   public static void main(String[] args) {
      OrderService orderService = new OrderService();
      System.out.println("blah1 order " + (orderService.order("blah1", 5) ? "succeeded" : "failed"));
      System.out.println("blah2 order " + (orderService.order("blah2", 20) ? "succeeded" : "failed"));
      System.out.println("null order " + (orderService.order(null, 10) ? "succeeded" : "failed"));
      System.out.println("negative order " + (orderService.order("blah1", -1) ? "succeeded" : "failed"));
   }

   public void setAmazonBookService(AmazonBookService amazonBookService) {
      this.amazonBookService = amazonBookService;
   }
}
