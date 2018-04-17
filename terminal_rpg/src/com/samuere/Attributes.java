package com.samuere;

public class Attributes {

	private int strenght;
	private int health;
	private int charisma;
	private int luck;

	public Attributes(int strenght, int health, int charisma, int luck) {
		this.strenght = strenght;
		this.health = health;
		this.charisma = charisma;
		this.luck = luck;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getDamage() {
		return 1;
	}

	public int getDefense() {
		return 1;
	}
}