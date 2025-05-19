package com.nt;

public class WareHouseINVENTORYMANAGEMENTSYSTEM {
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
    		 else if(num<largest && num>secondLargest) {
    			 secondLargest=num;
    		 }
    	 }
    	return (secondLargest==Integer.MIN_VALUE) ? -1:secondLargest;
     }
     public static void main(String[] args) {
		int[] arr= {-100,-200,-50,-300,-200};
		System.out.println("The Second Highest Number is:"+getSecondHighest(arr));	
	}
}