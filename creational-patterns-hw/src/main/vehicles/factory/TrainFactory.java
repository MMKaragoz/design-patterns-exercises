package main.vehicles.factory;

import main.vehicles.Vehicle;

public interface TrainFactory {

	public Vehicle create(String payloadType);
}
