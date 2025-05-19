package com.nt;

public class Hosteller extends StudentFee {
    double hostelFee;
	public Hosteller(int studentId, String name, double examFee,double hostelFee) {
		super(studentId, name, examFee);
		if(hostelFee<=0) {
			System.out.println("Error Invalid Input");
		}
		this.hostelFee=hostelFee;
	}

	@Override
	void displayDetails() {
		  System.out.println("StudentId "+studentId);
		  System.out.println("Student Name "+name);
		  System.out.println("ExamFee "+examFee);
		  System.out.println("HostelFee "+hostelFee);
	}
	
	@Override
	 double payFee(double amount) {
		double totalFee=examFee+hostelFee;
		   return totalFee-amount; 
	 }
}
