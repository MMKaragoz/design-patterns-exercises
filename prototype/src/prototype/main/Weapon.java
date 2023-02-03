package prototype.main;

public class Weapon {
	
	private String name;
	private int damage;
	private int bulletCount;
	
	
	public Weapon(String name, int damage, int bulletCount) {
		this.name = name;
		this.damage = damage;
		this.bulletCount = bulletCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getBulletCount() {
		return bulletCount;
	}

	public void setBulletCount(int bulletCount) {
		this.bulletCount = bulletCount;
	}

	
	
}
