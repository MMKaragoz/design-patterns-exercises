package builder.main.bicycle;

import builder.main.bicycle.backSet.BackSet;
import builder.main.bicycle.backSet.Cogset;
import builder.main.bicycle.backSet.RearBrakes;
import builder.main.bicycle.backSet.RearDerailleur;
import builder.main.bicycle.frame.ChainStay;
import builder.main.bicycle.frame.DownTube;
import builder.main.bicycle.frame.Frame;
import builder.main.bicycle.frame.SeatStay;
import builder.main.bicycle.frame.SeatTube;
import builder.main.bicycle.frame.TopTube;
import builder.main.bicycle.frontSet.Fork;
import builder.main.bicycle.frontSet.FrontBrakes;
import builder.main.bicycle.frontSet.FrontSet;
import builder.main.bicycle.frontSet.HandlebarGrip;
import builder.main.bicycle.frontSet.HeadTube;
import builder.main.bicycle.frontSet.ShockAbsorber;
import builder.main.bicycle.middleSet.Chain;
import builder.main.bicycle.middleSet.ChainRings;
import builder.main.bicycle.middleSet.CrankArm;
import builder.main.bicycle.middleSet.FrontDerailleur;
import builder.main.bicycle.middleSet.MiddleSet;
import builder.main.bicycle.middleSet.Pedal;
import builder.main.bicycle.saddleArea.Saddle;
import builder.main.bicycle.saddleArea.SaddleArea;
import builder.main.bicycle.saddleArea.SeatPost;
import builder.main.bicycle.wheel.Hub;
import builder.main.bicycle.wheel.Rim;
import builder.main.bicycle.wheel.Spokes;
import builder.main.bicycle.wheel.Tire;
import builder.main.bicycle.wheel.Valve;
import builder.main.bicycle.wheel.Wheel;
import builder.main.builder.BackSetBuilderI;
import builder.main.builder.FrameBuilderI;
import builder.main.builder.FrontSetBuilderI;
import builder.main.builder.MiddleSetBuilderI;
import builder.main.builder.SaddleAreaBuilderI;
import builder.main.builder.WheelBuilderI;

public class Bicycle {
	
	private static FrameBuilder frameBuilder;
	private static BackSetBuilder backSetBuilder;
	private static FrontSetBuilder frontSetBuilder;
	private static MiddleSetBuilder middleSetBuilder;
	private static SaddleAreaBuilder saddleAreaBuilder;
	private static WheelBuilder wheelBuilder;
	
	private String name;
	private Frame frame;
	private SaddleArea saddleArea;
	private FrontSet frontSet;
	private Wheel wheel;
	private BackSet backSet;
	private MiddleSet middleSet;
	
	public Bicycle() {
	}

	public Bicycle(String name, Frame frame, SaddleArea saddleArea, FrontSet frontSet, Wheel wheel, BackSet backSet,
			MiddleSet middleSet) {
		this.name = name;
		this.frame = frame;
		this.saddleArea = saddleArea;
		this.frontSet = frontSet;
		this.wheel = wheel;
		this.backSet = backSet;
		this.middleSet = middleSet;
	}

	public String getName() {
		return name;
	}
	public Frame getFrame() {
		return frame;
	}

	public SaddleArea getSaddleArea() {
		return saddleArea;
	}

	public FrontSet getFrontSet() {
		return frontSet;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public BackSet getBackSet() {
		return backSet;
	}

	public MiddleSet getMiddleSet() {
		return middleSet;
	}
	
	public static FrameBuilderI getFrameBuilder(String name) {
		frameBuilder = new FrameBuilder(name);
		return Bicycle.frameBuilder;
	}
	
	public static BackSetBuilderI getBackSetBuilder(FrameBuilder frameBuilder) {
		backSetBuilder = new BackSetBuilder(frameBuilder);
		return backSetBuilder;
	}
	
	public static FrontSetBuilderI getFrontSetBuilder(BackSetBuilder backSetBuilder) {
		frontSetBuilder = new FrontSetBuilder(backSetBuilder);
		return frontSetBuilder;
	}
	
	public static MiddleSetBuilderI getMiddleSetBuilder(FrontSetBuilder frontSetBuilder) {
		middleSetBuilder = new MiddleSetBuilder(frontSetBuilder);
		return middleSetBuilder;
	}
	
	public static SaddleAreaBuilderI getSaddleAreaBuilder(MiddleSetBuilder middleSetBuilder) {
		saddleAreaBuilder = new SaddleAreaBuilder(middleSetBuilder);
		return saddleAreaBuilder;
	}
	
	public static WheelBuilderI getWheelBuilder(SaddleAreaBuilder saddleAreaBuilder) {
		wheelBuilder = new WheelBuilder(saddleAreaBuilder);
		return wheelBuilder;
	}
	
 	@Override
	public String toString() {
		return "Bicycle [name=" + name + ", frame=" + frame + ", saddleArea=" + saddleArea + ", frontSet=" + frontSet
				+ ", wheel=" + wheel + ", backSet=" + backSet + ", middleSet=" + middleSet + "]";
	}

	public static class FrameBuilder implements FrameBuilderI {
		
		private String name;
		
		private boolean hasTopTube;
		private boolean hasDownTube;
		private boolean hasSeatTube;
		private boolean hasSeatStay;
		private boolean hasChainStay;
		
		private Bicycle bicycle;
		private Frame frame = new Frame();
	
		public FrameBuilder(String name) {
			this.name = name;
		}

		@Override
		public FrameBuilderI buildTopTube() {
			hasTopTube = true;
			return this;
		}

		@Override
		public FrameBuilderI buildDownTube() {
			hasDownTube = true;
			return this;
		}

		@Override
		public FrameBuilderI buildSeatTube() {
			hasSeatTube = true;
			return this;
		}

		@Override
		public FrameBuilderI buildSeatStay() {
			hasSeatStay = true;
			return this;
		}

		@Override
		public FrameBuilderI buildChainStay() {
			hasChainStay = true;
			return this;
		}

		@Override
		public Bicycle buildFrame() {
			bicycle = new Bicycle();
			bicycle.name = name;
			
			if (hasTopTube) {
				TopTube topTube = new TopTube();
				frame.setTopTube(topTube);
			}
			
			if (hasDownTube) {
				DownTube downTube = new DownTube();
				frame.setDownTube(downTube);
			}
			
			if (hasSeatTube) {
				SeatTube seatTube = new SeatTube();
				frame.setSeatTube(seatTube);
			}
			
			if (hasSeatStay) {
				SeatStay seatStay = new SeatStay();
				frame.setSeatStay(seatStay);
			}
			
			if (hasChainStay) {
				ChainStay chainStay = new ChainStay();
				frame.setChainStay(chainStay);
			}
			bicycle.frame = frame;
			
			return bicycle;
		}
		
		
	}

	public static class BackSetBuilder implements BackSetBuilderI {

		private Bicycle bicycle;
		
		private boolean hasRearBrakes;
		private boolean hasCogset;
		private boolean hasRearDerailleur;
		
		private BackSet backSet = new BackSet();
		
		public BackSetBuilder(FrameBuilder frameBuilder ) {
			bicycle = frameBuilder.bicycle;
		}

		@Override
		public BackSetBuilderI buildRearBrakes() {
			hasRearBrakes = true;
			return this;
		}

		@Override
		public BackSetBuilderI buildCogset() {
			hasCogset = true;
			return this;
		}

		@Override
		public BackSetBuilderI buildRearDerailleur() {
			hasRearDerailleur = true;
			return this;
		}

		@Override
		public Bicycle buildBackSet() {
			if (hasRearBrakes) {
				RearBrakes rearBrakes = new RearBrakes();
				backSet.setRearBrakes(rearBrakes);
			}
			
			if (hasCogset) {
				Cogset cogset = new Cogset();
				backSet.setCogset(cogset);
			}
			
			if (hasRearDerailleur) {
				RearDerailleur rearDerailleur = new RearDerailleur();
				backSet.setRearDerailleur(rearDerailleur);
			}
			bicycle.backSet = backSet;
			
			return bicycle;
		}
		
	}

	public static class FrontSetBuilder implements FrontSetBuilderI {

		private Bicycle bicycle;
		
		private boolean hasHandlebarGrip;
		private boolean hasHeadTube;
		private boolean hasShockAbsorber;
		private boolean hasFrontBrakes;
		private boolean hasFork;
		
		private FrontSet frontSet = new FrontSet();
		
		public FrontSetBuilder(BackSetBuilder backSetBuilder) {
			bicycle = backSetBuilder.bicycle;
		}
		@Override
		public FrontSetBuilderI buildHandlebarGrip() {
			hasHandlebarGrip = true;
			return this;
		}

		@Override
		public FrontSetBuilderI buildHeadTube() {
			hasHeadTube = true;
			return this;
		}

		@Override
		public FrontSetBuilderI buildShockAbsorber() {
			hasShockAbsorber = true;
			return this;
		}

		@Override
		public FrontSetBuilderI buildFrontBrakes() {
			hasFrontBrakes = true;
			return this;
		}

		@Override
		public FrontSetBuilderI buildFork() {
			hasFork = true;
			return this;
		}

		@Override
		public Bicycle buildFrontSet() {
			
			if (hasHandlebarGrip) {
				HandlebarGrip handlebarGrip = new HandlebarGrip();
				frontSet.setHandlebarGrip(handlebarGrip);
			}
			
			if (hasHeadTube) {
				HeadTube headTube = new HeadTube();
				frontSet.setHeadTube(headTube);
			}
			
			if (hasShockAbsorber) {
				ShockAbsorber shockAbsorber = new ShockAbsorber();
				frontSet.setShockAbsorber(shockAbsorber);
			}
			
			if (hasFrontBrakes) {
				FrontBrakes frontBrakes = new FrontBrakes();
				frontSet.setFrontBrakes(frontBrakes);
			}
			
			if (hasFork) {
				Fork fork = new Fork();
				frontSet.setFork(fork);
			}
			bicycle.frontSet = frontSet;
			
			return bicycle;
		}
		
	}

	public static class MiddleSetBuilder implements MiddleSetBuilderI {

		private Bicycle bicycle;
		
		private boolean hasFrontDerailleur;
		private boolean hasChain;
		private boolean hasChainRings;
		private boolean hasPedal;
		private boolean hasCrankArm;
		
		private MiddleSet middleSet = new MiddleSet();
		
		public MiddleSetBuilder(FrontSetBuilder frontSetBuilder) {
			bicycle = frontSetBuilder.bicycle;
		}
		
		@Override
		public MiddleSetBuilderI buildFrontDerailleur() {
			hasFrontDerailleur = true;
			return this;
		}

		@Override
		public MiddleSetBuilderI buildChain() {
			hasChain = true;
			return this;
		}

		@Override
		public MiddleSetBuilderI buildChainRings() {
			hasChainRings = true;
			return this;
		}

		@Override
		public MiddleSetBuilderI buildPedal() {
			hasPedal = true;
			return this;
		}

		@Override
		public MiddleSetBuilderI buildCrankArm() {
			hasCrankArm = true;
			return this;
		}

		@Override
		public Bicycle buildMiddleSet() {
			if (hasFrontDerailleur) {
				FrontDerailleur frontDerailleur = new FrontDerailleur();
				middleSet.setFrontDerailleur(frontDerailleur);
			}
			
			if (hasChain) {
				Chain chain = new Chain();
				middleSet.setChain(chain);
			}
			
			if (hasChainRings) {
				ChainRings chainRings = new ChainRings();
				middleSet.setChainRings(chainRings);
			}
				
			if (hasPedal) {
				Pedal pedal = new Pedal();
				middleSet.setPedal(pedal);
			}
			
			if (hasCrankArm) {
				CrankArm crankArm = new CrankArm();
				middleSet.setCrankArm(crankArm);
			}
			bicycle.middleSet = middleSet;
			
			return bicycle;
		}
		
	}

	public static class SaddleAreaBuilder implements SaddleAreaBuilderI {
		
		private Bicycle bicycle;
		
		private boolean hasSaddle;
		private boolean hasSeatPost;
		
		private SaddleArea saddleArea = new SaddleArea();

		public SaddleAreaBuilder(MiddleSetBuilder middleSetBuilder) {
			bicycle = middleSetBuilder.bicycle;
		}

		@Override
		public SaddleAreaBuilderI buildSaddle() {
			hasSaddle = true;
			return this;
		}

		@Override
		public SaddleAreaBuilderI buildSeatPost() {
			hasSeatPost = true;
			return this;
		}

		@Override
		public Bicycle buildSaddleArea() {
			
			if(hasSaddle) {
				Saddle saddle = new Saddle();
				saddleArea.setSaddle(saddle);
			}
			
			if (hasSeatPost) {
				SeatPost seatPost = new SeatPost();
				saddleArea.setSeatPost(seatPost);
			}
			
			bicycle.saddleArea = saddleArea;
			
			return bicycle;
		}
	}

	public static class WheelBuilder implements WheelBuilderI {

		private Bicycle bicycle;
		
		private boolean hasSpokes;
		private boolean hasHub;
		private boolean hasRim;
		private boolean hasTire;
		private boolean hasValve;
		
		private Wheel wheel = new Wheel();
		
		public WheelBuilder(SaddleAreaBuilder saddleAreaBuilder) {
			bicycle = saddleAreaBuilder.bicycle;
		}
		
		@Override
		public WheelBuilderI buildSpokes() {
			hasSpokes = true;
			return this;
		}

		@Override
		public WheelBuilderI buildHub() {
			hasHub = true;
			return this;
		}

		@Override
		public WheelBuilderI buildRim() {
			hasRim = true;
			return this;
		}

		@Override
		public WheelBuilderI buildTire() {
			hasTire = true;
			return this;
		}

		@Override
		public WheelBuilderI buildValve() {
			hasValve = true;
			return this;
		}

		@Override
		public Bicycle build() {
			
			if (hasSpokes) {
				Spokes spokes = new Spokes();
				wheel.setSpokes(spokes);
			}
			
			if (hasHub) {
				Hub hub = new Hub();
				wheel.setHub(hub);
			}
			
			if (hasRim) {
				Rim rim = new Rim();
				wheel.setRim(rim);
			}
			
			if (hasTire) {
				Tire tire = new Tire();
				wheel.setTire(tire);
			}
			
			if (hasValve) {
				Valve valve = new Valve();
				wheel.setValve(valve);
			}
			
			bicycle.wheel = wheel;
			
			return bicycle;
		}
		
		
	}
}
