package com.nt;

public class StudentTicket extends Ticket {
    private boolean studentDiscount;
    
	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}

	public StudentTicket(String eventName, int seatNumber, double price,boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount=studentDiscount;
		if(price<=0) {
			System.out.println("Error Invalid Input");
		}
	}

	@Override
	void TicketDetails() {
		   System.out.println("Event: "+getEventName());
		   System.out.println("Seat Number: "+getSeatNumber());
		   System.out.println("Price: "+getPrice());
		   System.out.println("Student Discount: "+studentDiscount);
	   }
}

