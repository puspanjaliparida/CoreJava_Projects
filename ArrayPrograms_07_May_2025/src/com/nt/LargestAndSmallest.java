/*1.WAP to find the largest and smallest element in an array.*/
package com.nt;

import java.util.Arrays;

/*public class LargestAndSmallest{
     public static void main(String[] args){
    	int arr[]= {20,30,10,50};
    	//Using Predefined Method to sort so that we can get the smallest and largest
	    Arrays.sort(arr);
		
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("Smallest element is::"+min);
		System.out.println("Largest element is::"+max);
	}
}*/

//Use Nested loop to fetch each element and compare with remaining
//Validate and swap the values
//Print the elements
public class LargestAndSmallest{
	public static void main(String[] args) {
		int arr[]= {20,30,10,50};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				//Ascending order swapping(>)
				//Descending order swapping(<)
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Smallest Element::"+arr[0]);
		System.out.println("Largest Element::"+arr[arr.length-1]);
	}
}
