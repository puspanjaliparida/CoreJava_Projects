package com.nt;

import java.util.Scanner;

public class AdvancedArithmeticMainClass {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number:");
	  int number=sc.nextInt();
	  MyCalculator calculator = new MyCalculator();
      System.out.println("The Sum is:"+calculator.divisorSum(number));
   }
}
