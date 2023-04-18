package com.tnsif.syncassignment;

public class Demo {

	public static void main(String[] args) {
		TrainTicketBooking booking = new TrainTicketBooking(10);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                booking.bookTicket(5);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                booking.bookTicket(1);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                booking.bookTicket(4);
            }
        });

        t1.start();
        t2.start();
        t3.start();

	}

}
