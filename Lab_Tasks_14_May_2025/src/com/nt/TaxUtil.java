package com.nt;

public class TaxUtil {
	public double calculatedTax(Employee e) {
		double totalSal=e.calculateGrossSalary();
		double tax=0.0;
		if(totalSal>30000) {
			tax = totalSal+0.20;
		}
		else {
			tax=totalSal+0.05;
		}
		return tax;
	}
     
	public double calculatedTax(Manager m) {
		double totalSal=m.calculateGrossSalary();
		double tax=0.0;
		if(totalSal>30000) {
			tax = totalSal+0.20;
		}
		else {
			tax=totalSal+0.05;
		}
		return tax;
	}
	
	public double calculatedTax(Trainer t) {
		double totalSal=t.calculateGrossSalary();
		double tax=0.0;
		if(totalSal>30000) {
			tax = totalSal+0.20;
		}
		else {
			tax=totalSal+0.05;
		}
		return tax;
	}
	
	public double calculatedTax(Sourcing s) {
		double totalSal=s.calculateGrossSalary();
		double tax=0.0;
		if(totalSal>30000) {
			tax = totalSal+0.20;
		}
		else {
			tax=totalSal+0.05;
		}
		return tax;
	}
}
