package com.sabre.training.tdd.intro.order;

import com.amazon.service.AmazonBookService;
import com.amazon.service.InvalidAmazonProductAmountException;
import com.amazon.service.InvalidAmazonProductIdException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyAmazonBookServiceTest {
   @Mock private AmazonBookService mockAmazonBookService;

   @Test
   public void shouldUseAmazonBookServiceToSuccessfulPlaceOrder() throws InvalidAmazonProductAmountException, InvalidAmazonProductIdException {

      MyAmazonBookService myAmazonBookService = new MyAmazonBookService();
      myAmazonBookService.setAmazonBookService(mockAmazonBookService);
      myAmazonBookService.purchase("product", 100);

      verify(mockAmazonBookService).placeOrder("product", 100);
   }

   @Test
   public void shouldIndicateOrderDidNotSucceedIfMissingInventory() throws InvalidAmazonProductAmountException, InvalidAmazonProductIdException {

      when(mockAmazonBookService.placeOrder(anyString(), anyInt())).thenReturn(false);

      MyAmazonBookService myAmazonBookService = new MyAmazonBookService();
      myAmazonBookService.setAmazonBookService(mockAmazonBookService);
      boolean result = myAmazonBookService.purchase("product", 100);

      assertFalse(result);
   }

   @Test(expected = UnknownProductIdException.class)
   public void shouldThrowUnknownProductIdExceptionForBadProductId() throws InvalidAmazonProductAmountException, InvalidAmazonProductIdException {

      when(mockAmazonBookService.placeOrder(anyString(), anyInt())).thenThrow(InvalidAmazonProductIdException.class);

      MyAmazonBookService myAmazonBookService = new MyAmazonBookService();
      myAmazonBookService.setAmazonBookService(mockAmazonBookService);
      myAmazonBookService.purchase("product", 100);
   }

   @Test
   public void shouldIndicateOrderDidNotSucceedForBadInventoryAmount() throws InvalidAmazonProductAmountException, InvalidAmazonProductIdException {
      when(mockAmazonBookService.placeOrder(anyString(), anyInt())).thenThrow(InvalidAmazonProductAmountException.class);

      MyAmazonBookService myAmazonBookService = new MyAmazonBookService();
      myAmazonBookService.setAmazonBookService(mockAmazonBookService);
      boolean result = myAmazonBookService.purchase("product", 100);

      assertFalse(result);
   }
}
