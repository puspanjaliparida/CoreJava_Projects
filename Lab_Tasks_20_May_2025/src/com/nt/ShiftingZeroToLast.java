/*Question.1)
 Write a java program for shifting the zero in the last indexes of the Array.
Example 1:- Suppose input  int []x={0,1,0,2,5,0,4,0,6,0};
       :- Output should be  :-> x={1, 2, 5, 4, 6, 0, 0, 0, 0, 0};
 
Example 2:- Suppose input  int []x={0,0,1,0,2,5,0,0,0,4,0,6,0,0};
       :- Output should be  :-> x={1, 2, 5, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0};*/
package com.nt;

public class ShiftingZeroToLast {
    public static void main(String[] args) {
		int x[]= {0,1,0,2,5,0,4,0,6,0};
		int j=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]!=0) {
				x[j]=x[i];
				j++;
			}
		}
		while(j<x.length) {
			x[j]=0;
			j++;
		}
		System.out.println("Output: ");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
	}
}
