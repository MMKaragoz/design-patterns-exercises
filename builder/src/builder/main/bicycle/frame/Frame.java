package builder.main.bicycle.frame;

public class Frame {
	private TopTube topTube;
	private DownTube downTube;
	private SeatTube seatTube;
	private SeatStay seatStay;
	private ChainStay chainStay;
	
	public Frame() {
		
	}
	
	public Frame(TopTube topTube, DownTube downTube, SeatTube seatTube, SeatStay seatStay, ChainStay chainStay) {
		this.topTube = topTube;
		this.downTube = downTube;
		this.seatTube = seatTube;
		this.seatStay = seatStay;
		this.chainStay = chainStay;
	}

	public TopTube getTopTube() {
		return topTube;
	}

	public void setTopTube(TopTube topTube) {
		this.topTube = topTube;
	}

	public DownTube getDownTube() {
		return downTube;
	}

	public void setDownTube(DownTube downTube) {
		this.downTube = downTube;
	}

	public SeatTube getSeatTube() {
		return seatTube;
	}

	public void setSeatTube(SeatTube seatTube) {
		this.seatTube = seatTube;
	}

	public SeatStay getSeatStay() {
		return seatStay;
	}

	public void setSeatStay(SeatStay seatStay) {
		this.seatStay = seatStay;
	}

	public ChainStay getChainStay() {
		return chainStay;
	}

	public void setChainStay(ChainStay chainStay) {
		this.chainStay = chainStay;
	}

	@Override
	public String toString() {
		return "Frame [topTube=" + topTube + ", downTube=" + downTube + ", seatTube=" + seatTube + ", seatStay="
				+ seatStay + ", chainStay=" + chainStay + "]";
	}
	
	
	
}
