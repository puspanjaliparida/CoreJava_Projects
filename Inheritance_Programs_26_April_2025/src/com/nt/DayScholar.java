package com.nt;

public class DayScholar extends StudentFee {
    double transportFee;
	public DayScholar(int studentId, String name, double examFee,double transportFee) {
		super(studentId, name, examFee);
		if(transportFee<=0) {
			System.out.println("Error Invalid Input");
		}
		this.transportFee=transportFee;
	}

	@Override
	void displayDetails() {
		  System.out.println("StudentId "+studentId);
		  System.out.println("Student Name "+name);
		  System.out.println("ExamFee "+examFee);
		  System.out.println("TransportFee "+transportFee);
	   }
	
	@Override
	 double payFee(double amount) {
		double totalFee=examFee+transportFee;
		   return totalFee-amount; 
     }
}
