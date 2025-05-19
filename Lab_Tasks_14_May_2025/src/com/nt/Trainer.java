package com.nt;

public class Trainer {
   int id;
   String name;
   double basicSalary;
   double HRAPer;
   double DAPer;
   int batchCount;
   double perkPerBatch;
   
   public int getId() {
	return id;
   }

   public void setId(int id) {
	this.id = id;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public double getBasicSalary() {
	return basicSalary;
   }

   public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
   }

  public double getHRAPer() {
	return HRAPer;
  }

  public void setHRAPer(double hRAPer) {
	HRAPer = hRAPer;
  }

  public double getDAPer() {
	return DAPer;
  }

  public void setDAPer(double dAPer) {
	DAPer = dAPer;
  }

  public int getBatchCount() {
	return batchCount;
  }

  public void setBatchCount(int batchCount) {
	this.batchCount = batchCount;
  }

  public double getPerkPerBatch() {
	return perkPerBatch;
  }

  public void setPerkPerBatch(double perkPerBatch) {
	this.perkPerBatch = perkPerBatch;
  }

   public double calculateGrossSalary() {
	   return basicSalary+HRAPer+DAPer+(batchCount*perkPerBatch);
   }
}
