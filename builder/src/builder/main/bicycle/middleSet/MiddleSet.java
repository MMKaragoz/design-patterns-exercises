package builder.main.bicycle.middleSet;

public class MiddleSet {
	private FrontDerailleur frontDerailleur;
	private Chain chain;
	private ChainRings chainRings;
	private Pedal pedal;
	private CrankArm crankArm;
	
	public MiddleSet() {
		
	}
	
	public MiddleSet(FrontDerailleur frontDerailleur, Chain chain, ChainRings chainRings, Pedal pedal,
			CrankArm crankArm) {
		this.frontDerailleur = frontDerailleur;
		this.chain = chain;
		this.chainRings = chainRings;
		this.pedal = pedal;
		this.crankArm = crankArm;
	}

	public FrontDerailleur getFrontDerailleur() {
		return frontDerailleur;
	}

	public void setFrontDerailleur(FrontDerailleur frontDerailleur) {
		this.frontDerailleur = frontDerailleur;
	}

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	public ChainRings getChainRings() {
		return chainRings;
	}

	public void setChainRings(ChainRings chainRings) {
		this.chainRings = chainRings;
	}

	public Pedal getPedal() {
		return pedal;
	}

	public void setPedal(Pedal pedal) {
		this.pedal = pedal;
	}

	public CrankArm getCrankArm() {
		return crankArm;
	}

	public void setCrankArm(CrankArm crankArm) {
		this.crankArm = crankArm;
	}

	@Override
	public String toString() {
		return "MiddleSet [frontDerailleur=" + frontDerailleur + ", chain=" + chain + ", chainRings=" + chainRings
				+ ", pedal=" + pedal + ", crankArm=" + crankArm + "]";
	}
	
	
	
}
