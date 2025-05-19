/*Q5. You are managing two small warehouses. Each warehouse has 5 items recorded
in arrays A and B. You want to merge them into a central inventory array C of
size 10 such that:
First half (0–4): Items from Warehouse A
Second half (5–9): Items from Warehouse B*/
package com.nt;

public class Warehouse {
  public static void main(String[] args) {
	  int A[]= {100,300,200,200,200};
	  int B[]= {200,300,201,504,202};
	  int C[]=new int[10];
	 
	  for(int i=0;i<A.length;i++) {
		  C[i]=A[i];
	  }
	  
	  for(int i=0;i<B.length;i++) {
		  C[i+5]=B[i];
	  }
	  System.out.print("The Items are: ");
      for (int i = 0; i < C.length; i++) {
          System.out.print(C[i] + " ,");
      }
  }
}
