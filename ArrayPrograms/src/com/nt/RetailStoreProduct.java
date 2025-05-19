/*Q7) A retail store maintains a list of product IDs in an array. Sometimes,
      due to system glitches,the same product ID is recorded multiple times.
      Write a Java program to count how many product IDs are repeated
      (appear more than once).
      Example Input:
      int[] productIds = {101, 102, 103, 101, 104, 105, 102};
      Expected Output:
      2 product IDs are repeated.
 * */
package com.nt;

import java.util.Arrays;

class RetailStores{
	int[] productIds= {101,102,103,101,104,105,102};
	int occuranceCount=0;
	public void displayRepeatedId() {
		Arrays.sort(productIds);
		System.out.println("Array Elements: "+Arrays.toString(productIds));
		for(int i=0;i<productIds.length;i++) {
			int count=0;
			for(int j=0;j<productIds.length-1;j++) {
				if(productIds[i]==productIds[j] && i>j) {
				    break;	
				}
				if(productIds[i]==productIds[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(productIds[i]+" "+ "Available "+count+" times");
				occuranceCount++;
			}
		}
		System.out.println(occuranceCount+" Product Ids Are Repeated.");
	}
}

public class RetailStoreProduct {
   public static void main(String[] args) {
	   RetailStores r1=new RetailStores();
	   r1.displayRepeatedId();
   }
}
