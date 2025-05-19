package com.nt;

public class CoronaVaccine {
	public static void main(String args[]) {
		User u1=new User("Ramesh",24,true);
		User u2=new User("Suresh",14,true);
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				try {
					u1.bookDose();
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
			}
		};
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				try {
					u2.bookDose();
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
			}
		};
		t1.start();
		t2.start();
	}
}