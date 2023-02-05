package main.vehicles.factory;

import main.vehicles.Vehicle;

public interface TruckFactory {

	public Vehicle create(String payloadType);
}
