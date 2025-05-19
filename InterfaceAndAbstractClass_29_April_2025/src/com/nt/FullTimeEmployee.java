package com.nt;

public class FullTimeEmployee implements IEmployee {
    private int employeeId;
    private String employeeName;
    private double monthlySalary;
    private double benefits;
    
    public FullTimeEmployee(int employeeId,String employeeName,double monthlySalary,double benefits) {
    	this.employeeId=employeeId;
    	this.employeeName=employeeName;
    	this.monthlySalary=monthlySalary;
    	this.benefits=benefits;
    }
    
	@Override
	public void calculateSalary() {
		double totalSalary = monthlySalary + benefits;
		System.out.println("Total salary: "+totalSalary);
	}

	@Override
	public void generatePayroll() {
		System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Monthly Salary : ₹" + monthlySalary);
        System.out.println("Benefits : ₹" + benefits);	
	}

}
