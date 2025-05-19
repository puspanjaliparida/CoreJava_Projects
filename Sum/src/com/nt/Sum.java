package com.nt;
class Sum 
{
	public static void findSum(Double... num){
		Double sum=num[0];
        for(Double number:num){
			sum=sum+number;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		findSum(145.0,255.0,100.0,15.0);
	}
}