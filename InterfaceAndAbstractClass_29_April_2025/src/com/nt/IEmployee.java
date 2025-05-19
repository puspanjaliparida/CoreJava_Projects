/*Q6)Employee Management System:

Employee Management System:
Employee Interface :
Create an interface named Employee with two methods: calculateSalary() and
generatePayroll().
The calculateSalary() method should compute the salary for the employee.
The generatePayroll() method should generate the payroll information for
the employee.

FullTimeEmployee Class :
Implement a class named FullTimeEmployee that implements the Employee interface.
Include attributes such as employeeId (int), employeeName (String),
monthlySalary (double), and benefits (double).
Provide a constructor that initializes the employee details.
Implement the calculateSalary() method to calculate the salary for a full-time employee,
including benefits.
Implement the generatePayroll() method to print the payroll information for a
full-time employee.

Testing :
Write a test program that demonstrates the functionality of your Employee
Management System.
Create instances of FullTimeEmployee.
Call the calculateSalary() and generatePayroll() methods to ensure correct
calculations and information generation.*/
package com.nt;

public interface IEmployee {
	public void calculateSalary();
    public void generatePayroll();
}
