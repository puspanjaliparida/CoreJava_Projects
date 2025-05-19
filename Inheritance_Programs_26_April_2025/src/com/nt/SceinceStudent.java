package com.nt;

public class SceinceStudent extends StudentClass {
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	public SceinceStudent(String name, int rollNumber,int physicsMarks ,int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathMarks=mathMarks;
		if(physicsMarks<=0 && chemistryMarks<=0 && mathMarks<=0) {
			System.out.println("Error Invalid Input");
		}
	}
    
	@Override
	public void displayDetails() {
		   System.out.println("The name of the Student is "+name);
		   System.out.println("RollNumber of the Student is "+rollNumber);
		   System.out.println("PhysicsMark of the Student "+physicsMarks);
		   System.out.println("ChemistryMark of the Student "+chemistryMarks);
		   System.out.println("MathMark of the Student "+mathMarks);
	}
	
	@Override
	public double calculatePercentage() {
		double total=0.0;
		double max1 = 100,max2 = 100,max3=100;
		double max_total=0.0;
		total=physicsMarks+chemistryMarks+mathMarks;
		max_total=max1+max2+max3;
		double percentage=0.0;
		return percentage=(total/max_total)*100;
	}
}


