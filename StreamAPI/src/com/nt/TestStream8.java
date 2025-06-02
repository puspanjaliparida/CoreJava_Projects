/*8.You are developing a HR module.Each Employee has details such as
 *  name,age,designation,performanceRatings.Employees whose performance 
 *  ratings is more than 4.0 are eligible for an appraisal.
 *  
 *  WAP to display the Employee details who are eligible for appraisal.*/
package com.nt;

import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private String designation;
    private double performanceRatings;
	public Employee(String name, int age, String designation, double performanceRatings) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.performanceRatings = performanceRatings;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public double getPerformanceRatings() {
		return performanceRatings;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", designation=" + designation + ", performanceRatings="
				+ performanceRatings + "]";
	}
}

public class TestStream8{
	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee("Ram",27,"Developer",4.3),
				new Employee("Khushi",47,"Senior Developer",3.5),
				new Employee("Madhu",52,"Manager",4.8)
				);
		System.out.println("Employees who are ready for appraisal");
		 employees.stream().filter(employee->employee.getPerformanceRatings()>4.0).
		          forEach(System.out::println);
	}
}