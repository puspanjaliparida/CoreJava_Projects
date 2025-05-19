package com.nt;
class PersonDetails 
{
	public static void printDetails(String name,String... hobbies){
		System.out.println("Name:"+name);
		String hobby="";
		for(String work:hobbies){
			hobby=hobby+work;
		}
		System.out.println("Hobbies are:"+hobby);
	}
	public static void main(String[] args) 
	{
		printDetails("khushi","Singing",",","Editing Photos",",","Coding");
	}
}