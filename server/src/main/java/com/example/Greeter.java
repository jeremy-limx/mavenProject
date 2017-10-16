package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * This is to return a string.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s! Webhook Testing Again!", someone);
  }
}
