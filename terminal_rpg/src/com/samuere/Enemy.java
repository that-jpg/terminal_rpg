package com.samuere;

import java.util.ArrayList;

public class Enemy extends Persona {
	private ArrayList<Item> loot = new ArrayList<Item>();
	
	public Enemy(String name, String description, Attributes attributes, Skill skills, int experience, ArrayList<Item> loot) {
		super(name, description, attributes, skills, experience);
		this.loot = loot;
	}
	
	public ArrayList<Item> getLoot(){
		return loot;
	}
}