package main.order;

import main.order.builder.OrderBuilderI;
import main.vehicles.Vehicle;

public class Order {
	
	private String destination;
	private String departure;
	
	private String paymentMethod;
	
	private String driverName;
	private Vehicle vehicle;
	
	
	private Order(String destination, String departure, String paymentMethod) {
		this.destination = destination;
		this.departure = departure;
		this.paymentMethod = paymentMethod;
	}

	public Order(String destination, String departure, String paymentMethod, String driverName, Vehicle vehicle) {
		this.destination = destination;
		this.departure = departure;
		this.paymentMethod = paymentMethod;
		this.driverName = driverName;
		this.vehicle = vehicle;
	}

	public String getDestination() {
		return destination;
	}

	public String getDeparture() {
		return departure;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getDriverName() {
		return driverName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Override
	public String toString() {
		return "Order [destination=" + destination + ", departure=" + departure + ", paymentMethod=" + paymentMethod
				+ ", driverName=" + driverName + ", vehicle=" + vehicle + "]";
	}
	
	public static OrderBuilder builder(String destination, String departure, String paymentMethod) {
		return new OrderBuilder(destination, departure, paymentMethod);
	}
	
	public static class OrderBuilder implements OrderBuilderI{

		private String destination;
		private String departure;
		private String paymentMethod;
		private String driverName;
		private Vehicle vehicle;
		
		public OrderBuilder(String destination, String departure, String paymentMethod) {
			this.destination = destination;
			this.departure = departure;
			this.paymentMethod = paymentMethod;
		}
		
		@Override
		public OrderBuilderI buildDriverName(String driverName) {
			this.driverName = driverName;
			return this;
		}

		@Override
		public OrderBuilderI buildVehicle(String payloadType, Vehicle vehicle) {
			this.vehicle = vehicle;
			this.vehicle.setPayloadType(payloadType);
			return this;
		}

		@Override
		public Order build() {
			Order order = new Order(destination, departure, paymentMethod);
			order.driverName = this.driverName;
			order.vehicle = this.vehicle;
			return order;
		}
		
	}
}
