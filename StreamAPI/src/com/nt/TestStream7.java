/*7.WAP to display all the Students details who have scored more than 
 * 80% in the test.*/
package com.nt;

import java.util.List;
import java.util.Arrays;

class Student{
	private String name;
	private String rollno;
	private double percentage;
	
	public Student(String name, String rollno, double percentage) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [Name=" + name + "\nRollno=" + rollno + "\nPercentage=" + percentage + "]";
	}
}

public class TestStream7 {
   public static void main(String[] args) {
	 List<Student> students=Arrays.asList(
			 new Student("Khushi","K123",60),
			 new Student("Omm","O567",86),
			 new Student("Mama","M232",88),
			 new Student("Pankaj","P782",96));
	 
	 System.out.println("Students who got more than 80% are: ");
	 students.stream().filter(student->student.getPercentage()<80).
	          forEach(System.out::println);
   }
}
