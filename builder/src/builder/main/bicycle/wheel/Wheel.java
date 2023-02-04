package builder.main.bicycle.wheel;

public class Wheel {
	private Spokes spokes;
	private Hub hub;
	private Rim rim;
	private Tire tire;
	private Valve valve;
	
	public Wheel() {
		
	}
	
	public Wheel(Spokes spokes, Hub hub, Rim rim, Tire tire, Valve valve) {
		this.spokes = spokes;
		this.hub = hub;
		this.rim = rim;
		this.tire = tire;
		this.valve = valve;
	}

	public Spokes getSpokes() {
		return spokes;
	}

	public void setSpokes(Spokes spokes) {
		this.spokes = spokes;
	}

	public Hub getHub() {
		return hub;
	}

	public void setHub(Hub hub) {
		this.hub = hub;
	}

	public Rim getRim() {
		return rim;
	}

	public void setRim(Rim rim) {
		this.rim = rim;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public Valve getValve() {
		return valve;
	}

	public void setValve(Valve valve) {
		this.valve = valve;
	}

	@Override
	public String toString() {
		return "Wheel [spokes=" + spokes + ", hub=" + hub + ", rim=" + rim + ", tire=" + tire + ", valve=" + valve
				+ "]";
	}

	

}
