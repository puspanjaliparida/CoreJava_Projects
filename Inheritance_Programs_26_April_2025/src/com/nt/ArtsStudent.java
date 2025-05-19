package com.nt;

public class ArtsStudent extends StudentClass {
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	
	public ArtsStudent(String name, int rollNumber,int historyMarks,int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		this.historyMarks=historyMarks;
		this.geographyMarks=geographyMarks;
		this.englishMarks=englishMarks;
		if(historyMarks<=0 && geographyMarks<=0 && englishMarks<=0) {
			System.out.println("Error Invalid Input");
		}
	}

	@Override
	public void displayDetails() {
		   System.out.println("The name of the Student is "+name);
		   System.out.println("RollNumber of the Student is "+rollNumber);
		   System.out.println("HistoryMark of the Student is "+historyMarks);
		   System.out.println("GeographyMark of the Student is "+geographyMarks);
		   System.out.println("EnglishMark of the Student is "+englishMarks);
	   }
	
	@Override
	public double calculatePercentage() {
		double total=0.0;
		double max1 = 100,max2 = 100,max3=100;
		double max_total=0.0;
		total=historyMarks+geographyMarks+englishMarks;
		max_total=max1+max2+max3;
		double percentage=0.0;
		return percentage=(total/max_total)*100;
	}
}
