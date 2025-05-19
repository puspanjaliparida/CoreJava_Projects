/*Q3. WAP to reverse an array.*/
package com.nt;

import java.util.Arrays;

public class Reverse {
   public static void main(String[] args) {
	  int arr[]= {20,30,10,20,50,60,70};
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr.length-i-1;j++) {
			  if(arr[j]>arr[j+1]) {
				  int num=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=num;
			  }
		  }
	  }
	  System.out.println(Arrays.toString(arr));
	  int start=0;
	  int end=arr.length-1;
	  while(start<end) {
		  int temp=arr[start];
		  arr[start]=arr[end];
		  arr[end]=temp;
		  start++;
		  end--;
	  }
	  System.out.println(Arrays.toString(arr));
   }
}

