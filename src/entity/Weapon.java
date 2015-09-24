package entity;

public class Weapon {

	private String name;
	private int damage;
	private int rateOfFire;	//tirs par secondes
	private int munition;
	private final int MAX_MUNITION;
	
	public Weapon() {
		this.MAX_MUNITION = 30;
	}
	
	public Weapon(String name, int damage, int rateOfFire, int munition, int maxMunition) {
		this.name = name;
		this.damage = damage;
		this.rateOfFire = rateOfFire;
		this.munition = munition;
		this.MAX_MUNITION = maxMunition;
	}
}
