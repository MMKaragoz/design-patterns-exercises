package builder.main.bicycle.backSet;

public class BackSet {
	private RearBrakes rearBrakes;
	private Cogset cogset;
	private RearDerailleur rearDerailleur;
	
	public BackSet() {
		
	}
	
	public BackSet(RearBrakes rearBrakes, Cogset cogset, RearDerailleur rearDerailleur) {
		this.rearBrakes = rearBrakes;
		this.cogset = cogset;
		this.rearDerailleur = rearDerailleur;
	}

	public RearBrakes getRearBrakes() {
		return rearBrakes;
	}

	public void setRearBrakes(RearBrakes rearBrakes) {
		this.rearBrakes = rearBrakes;
	}

	public Cogset getCogset() {
		return cogset;
	}

	public void setCogset(Cogset cogset) {
		this.cogset = cogset;
	}

	public RearDerailleur getRearDerailleur() {
		return rearDerailleur;
	}

	public void setRearDerailleur(RearDerailleur rearDerailleur) {
		this.rearDerailleur = rearDerailleur;
	}

	@Override
	public String toString() {
		return "BackSet [rearBrakes=" + rearBrakes + ", cogset=" + cogset + ", rearDerailleur=" + rearDerailleur + "]";
	}

	
	
	
}
