package main.vehicles.factory;

import main.vehicles.Vehicle;

public interface TIRFactory {

	public Vehicle create(String payloadType);
}
