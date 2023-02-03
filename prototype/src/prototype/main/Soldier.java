package prototype.main;

public class Soldier implements Cloneable{

	private String name;
	private String surname;
	private String team;
	private Weapon weapon;
	private String forces;
	
	public Soldier(String name, String surname, String team, Weapon weapon, String forces) {
		this.name = name;
		this.surname = surname;
		this.team = team;
		this.weapon = weapon;
		this.forces = forces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public String getForces() {
		return forces;
	}

	public void setForces(String forces) {
		this.forces = forces;
	}
	
	@Override
	public String toString() {
		return "Soldier [name=" + name + ", surname=" + surname + ", team=" + team + ", weapon=" + weapon + ", forces="
				+ forces + "]";
	}

	@Override
	public Soldier clone() {
		Soldier soldier = null;
		try {
			soldier = (Soldier) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Problem when cloning the object: " + e.getMessage());
			e.printStackTrace();
		}
		return soldier;
	}
	
}
