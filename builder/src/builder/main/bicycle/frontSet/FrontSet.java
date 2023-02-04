package builder.main.bicycle.frontSet;

public class FrontSet {

	private HandlebarGrip handlebarGrip;
	private HeadTube headTube;
	private ShockAbsorber shockAbsorber;
	private FrontBrakes frontBrakes;
	private Fork fork;
	
	public FrontSet() {
		
	}
	
	public FrontSet(HandlebarGrip handlebarGrip, HeadTube headTube, ShockAbsorber shockAbsorber,
			FrontBrakes frontBrakes, Fork fork) {
		this.handlebarGrip = handlebarGrip;
		this.headTube = headTube;
		this.shockAbsorber = shockAbsorber;
		this.frontBrakes = frontBrakes;
		this.fork = fork;
	}

	public HandlebarGrip getHandlebarGrip() {
		return handlebarGrip;
	}

	public void setHandlebarGrip(HandlebarGrip handlebarGrip) {
		this.handlebarGrip = handlebarGrip;
	}

	public HeadTube getHeadTube() {
		return headTube;
	}

	public void setHeadTube(HeadTube headTube) {
		this.headTube = headTube;
	}

	public ShockAbsorber getShockAbsorber() {
		return shockAbsorber;
	}

	public void setShockAbsorber(ShockAbsorber shockAbsorber) {
		this.shockAbsorber = shockAbsorber;
	}

	public FrontBrakes getFrontBrakes() {
		return frontBrakes;
	}

	public void setFrontBrakes(FrontBrakes frontBrakes) {
		this.frontBrakes = frontBrakes;
	}

	public Fork getFork() {
		return fork;
	}

	public void setFork(Fork fork) {
		this.fork = fork;
	}

	@Override
	public String toString() {
		return "FrontSet [handlebarGrip=" + handlebarGrip + ", headTube=" + headTube + ", shockAbsorber="
				+ shockAbsorber + ", frontBrakes=" + frontBrakes + ", fork=" + fork + "]";
	}	
	
	
}
