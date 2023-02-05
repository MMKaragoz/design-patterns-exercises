package main;

import main.order.Order;
import main.order.Order.OrderBuilder;
import main.vehicles.Train;

public class Test {

	public static void main(String[] args) {
		
		OrderBuilder builder = Order.builder("Marmaris", "Eskişehir", "prepaid");
		Order order = builder.build();
		System.out.println("Order");
		System.out.println(order);
		
		Order driverAssignedOrder = builder.buildDriverName("Mert").build();
		System.out.println("Driver Assigned Order");
		System.out.println(driverAssignedOrder);
		
		Order driverAndTrainAssignedOrder = builder.buildDriverName("Karagöz").buildVehicle("liquid load", new Train()).build();
		System.out.println("Driver and Train Assigned Order");
		System.out.println(driverAndTrainAssignedOrder);
	}

}
