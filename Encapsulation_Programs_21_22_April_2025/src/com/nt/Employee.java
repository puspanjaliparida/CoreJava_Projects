/*Ques - 2
-----------
Employee Performance Evaluation
You need to create a class that models an Employee in a performance
evaluation system. The Employee class should have the following
attributes:

Class name: Employee(BLC)
Attributes:

private: employeeName (String)
private: department (String)
private: baseSalary (double)
private: performanceScore (int) - a score between 1 and 10 representing
the employee's performance.
The performance score affects the employee's bonus. The bonus is calculated as:

Implement below methods:

Method name: calculateBonus()
return type: double
modifiers: public
Logic:
If the performance score is between 8 and 10, the bonus is 20% of the base salary.
If the performance score is between 5 and 7, the bonus is 10% of the base salary.
If the performance score is below 5, there is no bonus.
After calculating return the bonus.

Implement public setter methods to initialize each of these attributes.

Implement public getter methods to retrieve the values of these attributes

Create an ELC class EmployeeTester
Write a main method to:
Create an instance of the Employee class.
Initialize the attributes using setters.
Calculate and print the bonus with employee name, department, baseSalary by using getters.*/
package com.nt;

public class Employee {
    private String employeeName;
    private String department;
    private double baseSalary;
    private int performanceScore;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getPerformanceScore() {
		return performanceScore;
	}
	public void setPerformanceScore(int performanceScore) {
		this.performanceScore = performanceScore;
	}
    
    public double calculateBonus() {
    	double bonus = 0;
    	if(performanceScore>=8 && performanceScore<=10) {
    		bonus=baseSalary*0.2;
    	}
    	else if(performanceScore>=5 && performanceScore<=7) {
    		bonus=baseSalary*0.1;
    	}
    	else if(performanceScore<5){
    		System.out.println("No bonus will be there.");
    	}
    	return bonus;
    }
    
}

