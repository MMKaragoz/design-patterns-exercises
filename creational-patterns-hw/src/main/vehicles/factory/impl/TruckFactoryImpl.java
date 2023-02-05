package main.vehicles.factory.impl;

import main.vehicles.Truck;
import main.vehicles.Vehicle;
import main.vehicles.factory.TruckFactory;

public class TruckFactoryImpl implements TruckFactory {

	@Override
	public Vehicle create(String payloadType) {
		return new Truck(payloadType);
	}

}
