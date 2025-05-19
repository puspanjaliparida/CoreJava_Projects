/*Q4) A fitness tracking app stores the number of steps taken by a user over
      10 days. The app wants to show the user their total step count and average
      daily steps.
      Requirement:
      Write a Java program that stores the number of steps for 10 days in an array,
      calculates the total steps and average steps per day, and displays the result.
 * */
package com.nt;

import java.util.Scanner;

public class FitnessTrackingApp {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		int steps[] = new int[10];
		int totalSteps=0;
		for(int i=0;i<steps.length;i++) {
			System.out.println("Enter the  steps per Day "+(i+1));
			steps[i]=sc.nextInt();
			totalSteps=totalSteps+steps[i];
		}
		double averageSteps;
		averageSteps=totalSteps/steps.length;
		
		System.out.println("Total Steps in 10 days :"+totalSteps);
		System.out.println("Average Steps per day :"+averageSteps);
   }
}