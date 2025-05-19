/*Q4. Two teachers have marked the same set of 5 assignments. Their scores are
stored in arrays A and B. You need to generate a final score array C by summing
the corresponding scores given by both teachers.*/
package com.nt;

public class Assignments {
   public static void main(String[] args) {
	  int A[]= {50,70,80,67,80};
	  int B[]= {80,90,98,56,43};
	  int C[]=new int[5];
	  int sumofA=0;
	  int sumofB=0;
	  int sumofC = 0;
	  for(int i=0;i<A.length;i++) {
		  sumofA=sumofA+A[i];
	  }
	  
	  for(int i=0;i<B.length;i++) {
		  sumofB=sumofB+B[i];
	  }
	  for(int i=0;i<5;i++) {
		  sumofC=sumofA+sumofB;
	  }
	  System.out.println("Total Score is: "+sumofC);
   }
}
