package com.nt;
class ConcatStrings 
{
    public static void concatStrings(String... args){
        String concat="";
		for (String word : args)
		{
			concat=concat+word;
		}
		System.out.println(concat);
	}
	public static void main(String[] args) 
	{
	      concatStrings("Hello"," ","Everyone",",","Good"," ","Morning");
	}
}