/*Q5) A school maintains a list of student roll numbers who attended a special
      workshop. When a teacher wants to check if a particular student attended the
      session, the system should allow them to search using the roll number.
      Requirement:
      Write a Java program that stores student roll numbers in an array and allows
      the user to search for a specific roll number. If found, print a success
      message, otherwise display "Roll number not found."
 * */
package com.nt;

import java.util.Scanner;

class Workshop{
	int rollNo[]=new int[10];
	public void takeAttendance(int rollNo[]) {
		for(int i=0;i<rollNo.length;i++) {
			this.rollNo[i]=rollNo[i];//Copying from Array
		}
	}
	
	public void findStudent(int key) {
		boolean isPresent=false;
		for(int i=0;i<rollNo.length;i++) {
			if(key==rollNo[i]) {
				isPresent=true;
				break;
			}
		}
		if(isPresent==true) {
			System.out.println("Student with rollno "+key+" is found");
		}
		else {
			System.err.println("Student with the rollno "+key+" not found");
		}
	}
}

public class TestWorkShopDB{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roll Numbers");
		int rollNo[]=new int[10];
	    for(int i=0;i<rollNo.length;i++) {
	    	rollNo[i]=sc.nextInt();
	    }
	    Workshop w1=new Workshop();
	    w1.takeAttendance(rollNo);
	    System.out.println("Enter The Roll No. of the Student To Search: ");
	    int key=sc.nextInt();
	    w1.findStudent(key);
	}
}
