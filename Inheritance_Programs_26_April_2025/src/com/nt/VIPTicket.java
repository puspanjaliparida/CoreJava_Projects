package com.nt;

public class VIPTicket extends Ticket {
    private String specialAccess;
    
	public String getSpecialAccess() {
		return specialAccess;
	}
	
	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}

	public VIPTicket(String eventName, int seatNumber, double price,String specialAccess) {
		super(eventName, seatNumber, price);
		this.specialAccess=specialAccess;
		if(price<=0) {
			System.out.println("Error Invalid Input");
		}
	}
	
	@Override
	void TicketDetails() {
		   System.out.println("Event: "+getEventName());
		   System.out.println("Seat Number: "+getSeatNumber());
		   System.out.println("Price: "+getPrice());
		   System.out.println("Special Access: "+getSpecialAccess());
	   }
}

