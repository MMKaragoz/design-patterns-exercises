package prototype.main.factory.impl;

import prototype.main.Soldier;
import prototype.main.Weapon;
import prototype.main.factory.SoldierFactory;

public class SoldierFactoryImpl implements SoldierFactory {

	@Override
	public Soldier createNormalSoldier() {
		return SoldierPrototypes.normalSolder.clone();
	}

	@Override
	public Soldier createRedNavyForcesSoldier(String name, String surname, Weapon weapon) {
		Soldier soldier = SoldierPrototypes.redNavyForcesSoldier.clone();
		soldier.setName(name);
		soldier.setSurname(surname);
		soldier.setWeapon(weapon);
		return soldier;
	}

	@Override
	public Soldier createRedLandForcesSoldier(String name, String surname, Weapon weapon) {
		Soldier soldier = SoldierPrototypes.redLandForcesSoldier.clone();
		soldier.setName(name);
		soldier.setSurname(surname);
		soldier.setWeapon(weapon);
		return soldier;
	}

	@Override
	public Soldier createRedAirForcesSoldier(String name, String surname, Weapon weapon) {
		Soldier soldier = SoldierPrototypes.redAirForcesSoldier.clone();
		soldier.setName(name);
		soldier.setSurname(surname);
		soldier.setWeapon(weapon);
		return soldier;
	}

	@Override
	public Soldier createBlueNavyForcesSoldier(String name, String surname, Weapon weapon) {
		Soldier soldier = SoldierPrototypes.blueNavyForcesSoldier.clone();
		soldier.setName(name);
		soldier.setSurname(surname);
		soldier.setWeapon(weapon);
		return soldier;
	}

	@Override
	public Soldier createBlueLandForcesSoldier(String name, String surname, Weapon weapon) {
		Soldier soldier = SoldierPrototypes.blueLandForcesSoldier.clone();
		soldier.setName(name);
		soldier.setSurname(surname);
		soldier.setWeapon(weapon);
		return soldier;
	}

	@Override
	public Soldier createBlueAirForcesSoldier(String name, String surname, Weapon weapon) {
		Soldier soldier = SoldierPrototypes.blueAirForcesSoldier.clone();
		soldier.setName(name);
		soldier.setSurname(surname);
		soldier.setWeapon(weapon);
		return soldier;
	}

	static class SoldierPrototypes {
		
		static Soldier normalSolder = new Soldier(null, null, null, null, null);
		
		static Soldier redNavyForcesSoldier = new Soldier(null, null, "red", null, "navy");
		
		static Soldier redLandForcesSoldier = new Soldier(null, null, "red", null, "land");
		
		static Soldier redAirForcesSoldier = new Soldier(null, null, "red", null, "air");
		
		static Soldier blueNavyForcesSoldier = new Soldier(null, null, "blue", null, "navy");
		
		static Soldier blueLandForcesSoldier = new Soldier(null, null, "blue", null, "land");
		
		static Soldier blueAirForcesSoldier = new Soldier(null, null, "blue", null, "air");
		
	}
	
	

}
