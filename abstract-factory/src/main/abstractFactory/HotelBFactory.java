package main.abstractFactory;

import main.Customer;
import main.Payment;
import main.Reservation;
import main.Room;

public interface HotelBFactory {

	public Customer createCustomer();
	public Room createRoom();
	public Reservation createReservation();
	public Payment createPayment();
}
