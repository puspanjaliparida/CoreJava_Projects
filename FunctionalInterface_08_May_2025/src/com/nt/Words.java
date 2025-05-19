/*3.WAP for the following requirement::
-Create a functional interface which has a functionality 
 to take a number and display it in words.(Only if it is within 0-9)
 otherwise display try again.
-Perform functional programming with support of lambda expression
 to provide implementation to the Single Abstract Method.*/
package com.nt;

import java.util.Scanner;

@FunctionalInterface
interface DisplayInwords{
	void display(int n);
}

public class Words {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  DisplayInwords d1=(input)->{
		  String word[]= {"Zero","One","Two","Three","Four","Five",   
				           "Six","Seven","Eight","Nine"};
		  if(input>=0 && input<=9) {
			  System.out.println(word[input]);
		  }
		  else {
			  System.out.println("Try Again.");
		  }
	  };
	  System.out.println("Enter one number::");
	  d1.display(sc.nextInt());
  }
}
