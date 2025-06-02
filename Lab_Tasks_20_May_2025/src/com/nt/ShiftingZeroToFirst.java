/*Question.2) Write a java program for shifting the zero in the first indexes of the Array.
Example 1:- Suppose input  int []x={0,1,0,2,5,0,4,0,6,0};
       :- Output should be  :-> x={ 0, 0, 0, 0, 0,1,2,5,4,6};
 
Example 2:- Suppose input  int []x={0, 0, 1, 0, 2, 5, 0, 0, 0, 4, 0, 6, 0,0};
       :- Output should be  :-> x={0, 0, 0, 0, 0, 0, 0, 0, 0,1, 2, 5, 4, 6 };*/
package com.nt;

public class ShiftingZeroToFirst {
    public static void main(String[] args) {
		int x[]={0,1,0,2,5,0,4,0,6,0};
		int j=x.length-1;
		for(int i=j;i>=0;i--) {
			if(x[i]!=0) {
				x[j]=x[i];
				j--;
			}
		}
		while(j>=0) {
			x[j]=0;
			j--;
		}
		System.out.println("Output: ");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
	}
}
