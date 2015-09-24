package entity;

import java.util.ArrayList;
import java.util.List;

public class Character {
	
	private String name;
	private int healthPoints;
	private List<Weapon> weapons;
	
	
	public Character() {
		name = "Player";
		healthPoints = 100;
	}
	
	public Character (String name){
		this.name = name;
		weapons = new ArrayList<>();
	}
	
	public Character (String name, int healthPoints){
		this.name = name;
		this.healthPoints = healthPoints;
		weapons = new ArrayList<>();
	}
	
	public void attack(Character character) {
		
	}
	
	public void receiveDamage(int damage) {
		healthPoints -= damage;
	}
	
	public boolean isDead(){
		return healthPoints <=0;
	}
}
