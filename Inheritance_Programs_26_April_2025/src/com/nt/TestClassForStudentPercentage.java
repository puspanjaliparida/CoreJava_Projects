package com.nt;

public class TestClassForStudentPercentage {
  public static void main(String[] args) {
	  SceinceStudent sc=new SceinceStudent("Anjali", 101, 85, 90, 80);
	  sc.displayDetails();
	  System.out.println("Percentage "+sc.calculatePercentage());
	  System.out.println();
	  
	  ArtsStudent as=new ArtsStudent("Aryan", 102, 75, 80, 85);
	  as.displayDetails();
	  System.out.println("Percentage "+as.calculatePercentage());
  }
}
