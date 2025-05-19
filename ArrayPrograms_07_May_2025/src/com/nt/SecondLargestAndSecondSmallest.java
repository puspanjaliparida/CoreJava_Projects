/*2.WAP to find the second largest and second smallest element
 * in an array.*/
package com.nt;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
	static int getSecondHighest(int[] arr) {
	   	 if(arr==null || arr.length<2) {
	   		 return -1;
	   	 }
	   	 int largest=Integer.MIN_VALUE;
	   	 int secondLargest=Integer.MIN_VALUE;
	   	 for(int num : arr) {
	   		 if(num>largest) {
	   		    secondLargest=largest;
	   		    largest=num;
	   		 }
	   		 else if(num!=largest && num>secondLargest) {
	   			 secondLargest=num;
	   		 }
	   	 }
	   	return (secondLargest==Integer.MIN_VALUE) ? -1:secondLargest;
	    }
	
	static int getSecondSmallest(int[] arr) {
	   	 if(arr==null || arr.length<2) {
	   		 return -1;
	   	 }
	   	 int smallest=Integer.MAX_VALUE;
	   	 int secondSmallest=Integer.MAX_VALUE;
	   	 for(int num : arr) {
	   		 if(num<smallest) {
	   			secondSmallest=smallest;
	   		    smallest=num;
	   		 }
	   		 else if(num!=smallest && num<secondSmallest) {
	   			secondSmallest=num;
	   		 }
	   	 }
	   	return (secondSmallest==Integer.MAX_VALUE) ? -1:secondSmallest;
	    }
	
	public static void main(String[] args) {
		int arr[]= {20,30,10,30,10,70,80};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int num=SecondLargestAndSecondSmallest.getSecondHighest(arr);
		System.out.println("Second Higest number is:"+num);
		
		int small=SecondLargestAndSecondSmallest.getSecondSmallest(arr);
		System.out.println("Second Smallest number is:"+small);
	}
}
