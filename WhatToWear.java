import java.io.Console;

public class WhatToWear {
  public static void main(String[] args) {
    Console c = System.console();

    System.out.println("What temperature is it outside (in farenheight)?");
    Integer outsideTemp = Integer.parseInt(c.readLine());

    if(outsideTemp>90) {
      System.out.println("You should wear shorts and flip-flops");
    } else if(outsideTemp>65) {
      System.out.println("You should wear a skirt and flip-flops");
    } else if(outsideTemp<66) {
      System.out.println("You should wear jeans and flip-flops");
    } else {
      System.out.println("That doesn't seem to be a valid tempratrure, but uou can still wear flip-flops");
    }
  }
}
