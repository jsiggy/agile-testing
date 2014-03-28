package com.sabre.training.tdd.intro.order;

import com.amazon.service.AmazonBookService;
import com.amazon.service.InvalidAmazonProductAmountException;
import com.amazon.service.InvalidAmazonProductIdException;

public class MyAmazonBookService implements BookService {

   private AmazonBookService amazonBookService = new AmazonBookService();

   public boolean purchase(String productId, int amountOfProduct) {
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
      MyAmazonBookService myAmazonBookService = new MyAmazonBookService();
      System.out.println("blah1 purchase " + (myAmazonBookService.purchase("blah1", 5) ? "succeeded" : "failed"));
      System.out.println("blah2 purchase " + (myAmazonBookService.purchase("blah2", 20) ? "succeeded" : "failed"));
      System.out.println("null purchase " + (myAmazonBookService.purchase(null, 10) ? "succeeded" : "failed"));
      System.out.println("negative purchase " + (myAmazonBookService.purchase("blah1", -1) ? "succeeded" : "failed"));
   }

   public void setAmazonBookService(AmazonBookService amazonBookService) {
      this.amazonBookService = amazonBookService;
   }
}
