/*Q10. WAP to find the sum of all elements in array.*/
package com.nt;

public class SumofArrayElements {
    public static void main(String[] args) {
		int arr[]= {10,30,50,80};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of the elements is:"+sum);
	}
}
