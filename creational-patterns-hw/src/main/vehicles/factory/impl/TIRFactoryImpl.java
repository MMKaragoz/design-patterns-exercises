package main.vehicles.factory.impl;

import main.vehicles.TIR;
import main.vehicles.Vehicle;
import main.vehicles.factory.TIRFactory;

public class TIRFactoryImpl implements TIRFactory {

	@Override
	public Vehicle create(String payloadType) {
		return new TIR(payloadType);
	}

}
