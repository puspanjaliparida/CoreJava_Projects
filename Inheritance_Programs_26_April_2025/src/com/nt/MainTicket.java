package com.nt;

public class MainTicket {
	public static void main(String[] args) {
		Ticket tic=new Ticket("Concert", 101, 50.0);
		System.out.println("Regular Ticket:");
		tic.TicketDetails();
		System.out.println();
		
		VIPTicket vip=new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
		System.out.println("VIP Ticket:");
		vip.TicketDetails();
		System.out.println();
		
		StudentTicket st=new StudentTicket("Student Event", 301, 30.0, true);	
		System.out.println("Student Ticket:");
		st.TicketDetails();
	}
}
