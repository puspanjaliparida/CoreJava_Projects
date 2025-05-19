package com.nt;

public class StudentFeeTestClass {
   public static void main(String[] args) {
	  StudentFee st=new StudentFee(123, "John Smith", 100.0);
	  st.displayDetails();
	  double remaining1 = st.payFee(100.0);
      if (remaining1 == 0) {
          System.out.println("All Fees are clear");
      } else if (remaining1 > 0) {
          System.out.println("Remaining amount to pay is: " + remaining1);
      } else {
          System.out.println("Extra amount paid: " + (-remaining1));
      }

      System.out.println();
      
      DayScholar day = new DayScholar(124, "Brian Lara", 100.0, 500.0);
      day.displayDetails();
      double remaining2 = day.payFee(400.0);
      if (remaining2 == 0) {
          System.out.println("All Fees are clear");
      } else if (remaining2 > 0) {
          System.out.println("Remaining amount to pay is: " + remaining2);
      } else {
          System.out.println("Extra amount paid: " + (-remaining2));
      }

      System.out.println();
      
      Hosteller hos = new Hosteller(125, "Virat Kohli", 100.0, 800.0);
      hos.displayDetails();
      double remaining3 = hos.payFee(900.0);
      if (remaining3 == 0) {
          System.out.println("All Fees are clear");
      } else if (remaining3 > 0) {
          System.out.println("Remaining amount to pay is: " + remaining3);
      } else {
          System.out.println("Extra amount paid: " + (-remaining3));
      }
  }
}
