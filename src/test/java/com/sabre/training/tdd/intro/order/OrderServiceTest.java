package com.sabre.training.tdd.intro.order;

import com.amazon.service.AmazonBookService;
import com.amazon.service.InvalidAmazonProductAmountException;
import com.amazon.service.InvalidAmazonProductIdException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {
   @Mock private AmazonBookService mockAmazonBookService;

   @Test
   public void shouldUseAmazonBookServiceToPlaceOrder() throws InvalidAmazonProductAmountException, InvalidAmazonProductIdException {

      OrderService orderService = new OrderService();
      orderService.setAmazonBookService(mockAmazonBookService);
      orderService.order("product", 100);

      verify(mockAmazonBookService).placeOrder("product", 100);
   }
}
