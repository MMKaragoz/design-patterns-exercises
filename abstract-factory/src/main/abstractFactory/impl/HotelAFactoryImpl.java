package main.abstractFactory.impl;

import main.Customer;
import main.Payment;
import main.Reservation;
import main.Room;
import main.abstractFactory.HotelAFactory;

public class HotelAFactoryImpl implements HotelAFactory {

	@Override
	public Customer createCustomer() {
		return new Customer();
	}

	@Override
	public Room createRoom() {
		return new Room();
	}

	@Override
	public Reservation createReservation() {
		return new Reservation();
	}

	@Override
	public Payment createPayment() {
		return new Payment();
	}

}
