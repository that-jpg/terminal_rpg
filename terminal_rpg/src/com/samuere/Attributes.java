package com.samuere;

public class Attributes {

	private int strenght;
	private int actualStrenght;
	private int maxHealth;
	private int charisma;
	private int luck;
	private int defense;
	private int weaponEquipped = 0;
	private int shieldEquipped = 0;
	private int actualHealth;

	public Attributes(int strenght, int health, int charisma, int luck, int defense) {
		this.strenght = strenght;
		this.maxHealth = health;
		this.charisma = charisma;
		this.luck = luck;
		this.defense = defense;
		this.actualHealth = health;
		this.actualStrenght = strenght;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}
	
	public int getActualStrenght() {
		return actualStrenght;
	}
	
	public void setActualStrenght(int actualStrenght) {
		this.actualStrenght = actualStrenght;
	}

	public int getMaxHealth() {
		return this.maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
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
		int aux = 0;
		aux = actualStrenght + weaponEquipped;
		return aux;
	}

	public int getDefense() {
		int aux = 0;
		aux = defense + shieldEquipped;
		return aux;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setSwordEquipped(int effect) {
		this.weaponEquipped = effect;
	}

	public void setShieldEquipped(int effect) {
		this.shieldEquipped = effect;
	}

	public void setActualHealth(int actualHealth) {
		this.actualHealth = actualHealth;
	}

	public int getActualHealth() {
		return this.actualHealth;
	}

	public boolean isSwordEquipped() {
		if (weaponEquipped != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isShieldEquipped() {
		if (shieldEquipped != 0) {
			return true;
		} else {
			return false;
		}
	}
}
