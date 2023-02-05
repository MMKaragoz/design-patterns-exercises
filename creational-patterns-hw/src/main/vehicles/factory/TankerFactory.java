package main.vehicles.factory;

import main.vehicles.Vehicle;

public interface TankerFactory {

	public Vehicle create(String payloadType);
}
