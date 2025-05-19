/*Q8) An e-commerce application stores category IDs of listed products in
      an array. Management wants to know how many unique product categories are
      available in the system.
      Write a Java program to count the number of unique elements in the array.
      Example Input:
      int[] categoryIds = {1, 2, 3, 2, 4, 5, 3};
      Expected Output:
      4 unique category IDs found.
 * */
package com.nt;

import java.util.Arrays;

class E_CommerceCategories{
	int[] categoryIds= {1,2,3,2,4,5,3};
	int occuranceCount=0;
	
	public void displayNonRepeatedId() {
		Arrays.sort(categoryIds);
		System.out.println("Array Elements: "+Arrays.toString(categoryIds));
		
		for(int i=0;i<categoryIds.length;i++) {
			int count=0;
			
			for(int j=0;j<categoryIds.length;j++) {
				if(categoryIds[i]==categoryIds[j]) {
					count++;
				}
			}
			if(count==1) {
					System.out.println(categoryIds[i] + " Available " + count + " time");
					occuranceCount++;
			}
		}
		System.out.println(occuranceCount+" Unique Category IDs found.");
	}
}

public class E_CommerceApp {
   public static void main(String[] args) {
	   E_CommerceCategories r1=new E_CommerceCategories();
	   r1.displayNonRepeatedId();
   }
}
