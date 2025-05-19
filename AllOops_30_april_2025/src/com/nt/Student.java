package com.nt;

public class Student extends Person {
   private String rollNumber;
   private String course;
   
   public Student() {}

   public Student(String name, int age,String rollNumber,String course) {
	super(name, age);
	this.rollNumber=rollNumber;
	this.course=course;
   }

   public String getRollNumber() {
	return rollNumber;
   }

   public void setRollNumber(String rollNumber) {
	this.rollNumber = rollNumber;
   }

   public String getCourse() {
	return course;
   }

   public void setCourse(String course) {
	this.course = course;
   } 
   
   void displayStudentInfo() {
	   System.out.println("Name: "+getName());
	   System.out.println("Age: "+getAge());
	   System.out.println("RollNumber: "+getRollNumber());
	   System.out.println("Course: "+getCourse());
   }
}
