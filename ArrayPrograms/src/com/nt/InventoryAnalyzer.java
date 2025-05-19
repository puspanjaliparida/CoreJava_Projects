package com.nt;

import java.util.Arrays;
 
class FindSecondHighestStock{
	 public static int findSecondHighestStock(int[] stocks) {
		 System.out.println("Array Elements: "+Arrays.toString(stocks));
		 for(int i=0;i<stocks.length;i++) {
			 if(stocks.length<=1) {
				 return -1;
			 }
			 else {
				 int highest=stocks[0];
				 int secondHighest=stocks[1];
				 if(highest<secondHighest) {
					 return secondHighest;
				 }
			 }
		 }
		 return -1;	
	    }
}

public class InventoryAnalyzer{
	public static void main(String[] args) {
		int num=FindSecondHighestStock.findSecondHighestStock(new int[] {10,40,50,10,30,80});
		System.out.println("The Second Highest value is::"+num);
	}
}
