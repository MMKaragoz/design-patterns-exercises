package main.vehicles;

public abstract class Vehicle {
	private String payloadType;

	public Vehicle() {
		
	}
	
	public Vehicle(String payloadType) {
		this.payloadType = payloadType;
	}

	public String getPayloadType() {
		return payloadType;
	}

	public void setPayloadType(String payloadType) {
		this.payloadType = payloadType;
	}

	@Override
	public String toString() {
		return "Vehicle [payloadType=" + payloadType + "]";
	}

}
