package com.nt;
class TargetValue 
{
	public static void numbersList(int target,int... numbers){
		for(int num : numbers){
			if(num == target) {
				System.out.println("Target is Found");
				return;
			}
		}
		System.out.println("Target is not Found");
	}
	public static void main(String[] args) 
	{
		numbersList(10,89,34,378,10);
		numbersList(10,3,45,13);
	}
} 