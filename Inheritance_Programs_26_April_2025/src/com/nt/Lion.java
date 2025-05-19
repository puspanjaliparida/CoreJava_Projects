package com.nt;

public class Lion extends AnimalInZoo {
   private int maneLength;

   public Lion(String name, int age,int maneLength) {
	  super(name, age);
	  if(age<=0 || maneLength<=0) {
			System.out.println("Error Invalid Input.");
		}
	  this.maneLength=maneLength;
   }
   
   @Override
   public void displayInfo() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
	}
   
   public void makeSound(){
	  System.out.println("The Lion roars Loudly.");
   }
   
   public void displayManeLength() {
	   System.out.println("ManeLength is "+maneLength);
   }
}
