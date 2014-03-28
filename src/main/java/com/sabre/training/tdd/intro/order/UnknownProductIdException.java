package com.sabre.training.tdd.intro.order;

public class UnknownProductIdException extends RuntimeException {

   public UnknownProductIdException(String message, Throwable cause) {
      super(message, cause);
   }
}
