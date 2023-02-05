package main.order.builder;

import main.order.Order;
import main.vehicles.Vehicle;

public interface OrderBuilderI {

	public OrderBuilderI buildDriverName(String driverName);
	public OrderBuilderI buildVehicle(String payloadType, Vehicle vehicle);
	public Order build();
}
