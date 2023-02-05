package main.vehicles.factory.impl;

import main.vehicles.Tanker;
import main.vehicles.Vehicle;
import main.vehicles.factory.TankerFactory;

public class TankerFactoryImpl implements TankerFactory {

	@Override
	public Vehicle create(String payloadType) {
		return new Tanker(payloadType);
	}

}
