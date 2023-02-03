package prototype.main.factory;

import prototype.main.Soldier;
import prototype.main.Weapon;

public interface SoldierFactory {

	Soldier createNormalSoldier();
	
	Soldier createRedNavyForcesSoldier(String name, String surname, Weapon weapon);
	Soldier createRedLandForcesSoldier(String name, String surname, Weapon weapon);
	Soldier createRedAirForcesSoldier(String name, String surname, Weapon weapon);
	
	Soldier createBlueNavyForcesSoldier(String name, String surname, Weapon weapon);
	Soldier createBlueLandForcesSoldier(String name, String surname, Weapon weapon);
	Soldier createBlueAirForcesSoldier(String name, String surname, Weapon weapon);
}
