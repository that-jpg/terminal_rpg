package com.samuere;

public class Weapon extends Item {

	private String type;
	private String reach;
	private int size;

	public Weapon(String name, String effect, String description, double price, String type, String reach, int size) {
		super(name, effect, description, price);
		this.type = type;
		this.reach = reach;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReach() {
		return reach;
	}

	public void setReach(String reach) {
		this.reach = reach;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
