/*Q6. WAP to sort an array in descending order.*/package com.nt;

import java.util.Arrays;

public class DescendingOrder {
     public static void main(String[] args) {
		int arr[]={20,30,10,30,10,70,80};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
