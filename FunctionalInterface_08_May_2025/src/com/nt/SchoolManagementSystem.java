/*                  SET-B
 * Ques - 4
--------------
 School Management System with Inner Classes

You are tasked with developing a Java program for managing a school system. The program should allow users to add faculty members, enroll students, and assign students to specific classes. Additionally, the program should provide functionality to retrieve information about faculty members and students. Your objective is to design a flexible solution using inner classes to encapsulate related functionalities within the school management system.

Your program should include the following components:

School Class:

Create a class named School to represent the school system. It should have the following attributes:
Attributes:
schoolName (String): The name of the school.
location (String): The location of the school.
Methods:
addFaculty(String name, String department, String subject): Adds a new faculty member to the school with the specified name, department, and teaching subject.
getFacultyDetails(String name): Retrieves details of a faculty member by their name.
enrollStudent(String name, int rollNumber, String classEnrolled): Enrolls a new student in the school with the specified name, roll number, and class enrolled.
getStudentDetails(String name): Retrieves details of a student by their name.
assignStudentToClass(String name, String className): Assigns a student to a specific class by their name.

Inner Class for Faculty Members:
Define an inner class named Faculty within the School class to represent faculty members. Each faculty member should have attributes such as :
name (String): The name of the faculty member.
department (String): The department to which the faculty member belongs.
subject (String): The subject taught by the faculty member.
Methods:
getName(): Retrieves the name of the faculty member.
getDepartment(): Retrieves the department of the faculty member.
getSubject(): Retrieves the list of subjects taught by the faculty member.

Inner Class for Students:
Define another inner class named Student within the School class to represent students. Each student should have attributes such as :
name (String): The name of the student.
rollNumber (int): The roll number of the student.
classEnrolled (String): The class in which the student is enrolled.
Methods:
getName(): Retrieves the name of the student.
getRollNumber(): Retrieves the roll number of the student.
getClassEnrolled(): Retrieves the class in which the student is enrolled.

Main Program:

Create an instance of the School class to represent the school system.
Allow users to perform operations such as adding faculty members, enrolling students, assigning students to classes, and retrieving information about faculty members and students.
Provide options for users to view lists of faculty members and students, search for specific faculty members or students, and display their details.

Sample Output:
-------------------
Faculty Details:
Name: Amit Sharma
Department: Mathematics
Subject: Algebra

Student Details:
Name: Rahul Gupta
Roll Number: 101
Class Enrolled: Grade 10

 * */
package com.nt;

public class SchoolManagementSystem {
    String schoolName;
    String location;
   
    public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	void addFaculty(String name, String department, String subject){
 
    }
	
	void getFacultyDetails(String name){
		
	}
	
	void enrollStudent(String name, int rollNumber, String classEnrolled) {
		
	}
	
	void getStudentDetails(String name){
		
	}
	
	void assignStudentToClass(String name, String className){
		
	}
	
	class Faculty {
		String name;
		String department;
		String subject;
		
		public String getName() {
			return name;
		}
		
		public String getDepartment() {
			return department;
		}
	
		public String getSubject() {
			return subject;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}
	}
	
	class Student {
		String name;
		int rollNumber;
		String classEnrolled;
		
		public String getName() {
			return name;
		}
		
		public int getRollNumber() {
			return rollNumber;
		}
		
		public String getClassEnrolled() {
			return classEnrolled;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		
		public void setClassEnrolled(String classEnrolled) {
			this.classEnrolled = classEnrolled;
		}
	}
	
	public static void main(String[] args) {
		SchoolManagementSystem sc=new SchoolManagementSystem();
		SchoolManagementSystem.Faculty f1=sc.new Faculty();
		
		System.out.println("Faculty Details:");
		f1.setName("Amit Sharma");
		f1.setDepartment("Mathematics");
		f1.setSubject("Algebra");
		System.out.println("Name: "+f1.getName());
		System.out.println("Department: "+f1.getDepartment());
		System.out.println("Subject: "+f1.getSubject());
		System.out.println();
		
		SchoolManagementSystem.Student s1=sc.new Student();
		System.out.println("Student Details:");
	    s1.setName("Rahul Gupta");
	    s1.setRollNumber(101);
	    s1.setClassEnrolled("Grade 10");
	    System.out.println("Name: "+s1.getName());
	    System.out.println("Roll Number: "+s1.getRollNumber());
	    System.out.println("Class Enrolled: "+s1.getClassEnrolled());
	    
	}
}

