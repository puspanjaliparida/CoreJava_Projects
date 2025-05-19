package com.nt;

public class EmployeeMainClass {
  public static void main(String[] args) {
	 FullTimeEmployee ft=new FullTimeEmployee(1001, "Khushi", 50000.0, 1000);
	 ft.generatePayroll();
	 ft.calculateSalary();
  }
}