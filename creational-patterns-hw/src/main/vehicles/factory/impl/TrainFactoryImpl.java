package main.vehicles.factory.impl;

import main.vehicles.Train;
import main.vehicles.Vehicle;
import main.vehicles.factory.TrainFactory;

public class TrainFactoryImpl implements TrainFactory {

	@Override
	public Vehicle create(String payloadType) {
		return new Train(payloadType);
	}

}
