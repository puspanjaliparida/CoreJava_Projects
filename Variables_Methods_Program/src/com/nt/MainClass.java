package com.nt;

import java.util.Scanner;

class InvalidCredentialException extends Exception {
    public InvalidCredentialException(String msg) {
   	 super(msg);
    }
}

class Irctc {
    private String uid,pwd,destination,source,date;
    int noOfPassengers;
    private int ticketCount = 0;
    
    //For Getter and Setter(Alt+Shift+s)
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
    
	public void login(String uid,String pwd,Scanner sc) 
			          throws InvalidCredentialException{
		if(uid.equals("User123")&&pwd.equals("khushi@123")) {
		   System.out.println("Login Successful.");
		   System.out.println();
		
		   System.out.println("Enter the Source:");
		   setSource(sc.nextLine());
		
		   System.out.println("Enter the Destination:");
		   setDestination(sc.nextLine());
		
		   System.out.println("Enter the Date:");
		   setDate(sc.nextLine());
		
		   System.out.println("Enter no. of Passengers:");
		   setNoOfPassengers(sc.nextInt());
		
		   bookTicket(this, sc);
	    }
	    else {
		   throw new InvalidCredentialException("You have entered the wrong UserId"
	                 +"Or Password!Try Again Later.");
	    }
	}
	
	public void bookTicket(Irctc c,Scanner sc) {
		if (noOfPassengers > 5) {
		    System.out.println("Booking failed:You can book a maximum of 5 passengers ticket per a day.");
		    return;
		}
        sc.nextLine();
        System.out.print("Enter Booking Date: ");
        date = sc.nextLine();

        

        ticketCount++;
        System.out.println("Ticket booked successfully for " + noOfPassengers + " passengers on " + date);
	}
}

public class MainClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Irctc i1=new Irctc();
		while(true) {
			System.out.println("Enter User Id:");
			i1.setUid(sc.nextLine());
			
			System.out.println("Enter Password:");
			i1.setPwd(sc.nextLine());
			
			try {
				i1.login(i1.getUid(), i1.getPwd(), sc);
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
