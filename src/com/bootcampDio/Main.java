package com.bootcampDio;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int chosenNumber;
    int result;

    System.out.println("Hello!");

    System.out.println("Please type a number between 1 and 10 to generate the multiplication table of this number: ");
      chosenNumber = scan.nextInt();

    if(chosenNumber < 1 || chosenNumber > 10) {
      System.out.println("Invalid number.");
      return;
    }

    System.out.println("Multiplication table of " + chosenNumber + " :");

    for (int i = 1; i < 11; i++) {
      result = chosenNumber * i;
      System.out.println(chosenNumber + " x " + i + " = " + result);
    }
  }
}
