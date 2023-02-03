package prototype.main;

import prototype.main.factory.SoldierFactory;
import prototype.main.factory.impl.SoldierFactoryImpl;

public class Test {

	private static SoldierFactory soldierFactory = new SoldierFactoryImpl();
	
	public static void main(String[] args) {
		
		Soldier normalSoldier = soldierFactory.createNormalSoldier();
		System.out.println(normalSoldier);
		
		Weapon m4a1 = new Weapon("M4A1", 90, 120);
		
		// red team
		System.out.println("Red Team:");
		
		Soldier redNavyForcesSoldier = soldierFactory.createRedNavyForcesSoldier("Red Navy", "Forces", m4a1);
		System.out.println(redNavyForcesSoldier);
		
		Soldier redLandForcesSoldier =  soldierFactory.createRedLandForcesSoldier("Red Land", "Forces", m4a1);
		System.out.println(redLandForcesSoldier);
		
		Soldier redAirForcesSoldier = soldierFactory.createRedAirForcesSoldier("Red Air", "Forces", m4a1);
		System.out.println(redAirForcesSoldier);
		
		// blue team
		System.out.println("Blue Team:");
		
		Soldier blueNavyForcesSoldier = soldierFactory.createBlueNavyForcesSoldier("Blue Navy", "Forces", m4a1);
		System.out.println(blueNavyForcesSoldier);
		
		Soldier blueLandForcesSoldier = soldierFactory.createBlueLandForcesSoldier("Blue Land", "Forces", m4a1);
		System.out.println(blueLandForcesSoldier);
		
		Soldier blueAirForcesSoldier = soldierFactory.createBlueAirForcesSoldier("Blue Air", "Forces", m4a1);
		System.out.println(blueAirForcesSoldier);
	}

}
