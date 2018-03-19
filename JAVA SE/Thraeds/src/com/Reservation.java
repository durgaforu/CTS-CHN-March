package com;
class Operator extends Thread {
	int noOfSeats = 1;
	int wanted;

	public Operator(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public synchronized void bookTicket() {

		String tname = Thread.currentThread().getName();
		System.out.println("Booking " + wanted + " Seats for " + tname);
		
		if (wanted <= noOfSeats) {
			
			
			noOfSeats = noOfSeats - wanted;
			System.out.println(wanted + " Seats Booked for " + tname);
			System.out.println("Available Seats: " + noOfSeats);
		} else {
			System.out.println("Sorry, No Seats available");
		}

	}

}

public class Reservation {

	public static void main(String[] args) {

		Operator op = new Operator(1);
		Thread p1 = new Thread(op);
		Thread p2 = new Thread(op);

		p1.setName("Passenger-1");
		p2.setName("Passenger-2");

		p1.start();
		p2.start();

	}

}
