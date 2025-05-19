/*Q9) In a loyalty rewards system, customer IDs are stored in an array. Due to
      system errors, some customer IDs were registered multiple times.
      Write a Java program to print all duplicate customer IDs from the given array.
      Example Input:
      int[] customerIds = {2001, 2002, 2003, 2001, 2004, 2002};
      Expected Output:
      Duplicate Customer IDs: 2001, 2002
 * */
package com.nt;

import java.util.Arrays;

class Loyalty{
	int[] customerIds= {2001,2002,2003,2001,2004,2002};
	int occuranceCount=0;
	public void displayNonRepeatedId() {
		Arrays.sort(customerIds);
		
		System.out.println("Array Elements: "+Arrays.toString(customerIds));
		System.out.print("Duplicate Customer IDs: ");
		
		for(int i=0;i<customerIds.length;i++) {
			int count=0;
			for(int j=0;j<customerIds.length-1;j++) {
				if(customerIds[i]==customerIds[j] && i>j) {
				    break;	
				}
				if(customerIds[i]==customerIds[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(customerIds[i]);
				occuranceCount++;
			}
		}
		//System.out.println("Duplicate Customer IDs:" +customerIds[i]);
	}
}

public class LoyaltyRewardSystem {
   public static void main(String[] args) {
	   Loyalty r1=new Loyalty();
	   r1.displayNonRepeatedId();
   }
}

