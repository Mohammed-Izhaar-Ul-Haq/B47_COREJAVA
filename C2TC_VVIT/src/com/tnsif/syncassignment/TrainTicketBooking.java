package com.tnsif.syncassignment;

public class TrainTicketBooking {
	private int availableSlots;

    public TrainTicketBooking(int slots) {
        this.availableSlots = slots;
    }

    public synchronized void bookTicket(int slots) {
        if (availableSlots >= slots) {
            System.out.println("Booking successful for " + slots + " slots.");
            availableSlots -= slots;
            System.out.println("Remaining slots: " + availableSlots);
        } else {
            System.out.println("Sorry, no slots available.");
        }
    }

}
