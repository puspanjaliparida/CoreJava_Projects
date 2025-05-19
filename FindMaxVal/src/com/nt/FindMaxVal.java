package com.nt;
class FindMaxVal 
{
	public static void findMax(int... num){
		int maxVal=num[0];
         for(int i=0;i<num.length;i++){
			 if(num[i]>maxVal){
				 maxVal=num[i];
			 }
		 }
		 System.out.println(maxVal);
	}
	public static void main(String[] args) 
	{
		findMax(12,190,58,290,299,11,29);
	}
}