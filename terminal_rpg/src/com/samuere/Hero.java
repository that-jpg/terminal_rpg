package com.samuere;

import java.util.ArrayList;

public class Hero extends Persona {

	private ArrayList<Item> items;
	private int level;
	private int money;

	public Hero(String name, String description) {
		super(name, description, new Attributes(1, 10, 5, 5, 2), new Skill(), 0);
		this.items = new ArrayList<Item>();
		this.level = 1;
		this.money = 500;
	}
	
	public void upExperience(int xp) {
		int newExperience = this.getExperience() + xp;
		if(newExperience >= this.getExperienceToUp()) {
			newExperience = newExperience - this.getExperienceToUp();
			this.setExperience(newExperience);
			this.setLevel(this.getLevel() + 1);
			setExperienceToUp();
			System.out.println("Você evoluiu para o nivel " + this.getLevel());
			this.getAttributes().setMaxHealth(this.getLevel()*this.getAttributes().getMaxHealth());
			this.getAttributes().setActualHealth(this.getAttributes().getMaxHealth());
		} else {
			this.setExperience(newExperience);
		}
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public int[] allPotions(){

		int[] vec = {0 , 0 , 0 , 0};

		for(Item i : this.items){
			if (i instanceof Potion){
				if( ((Potion) i).getType() == Potion.PVIDA){
					vec[0]++;
				}else if( ((Potion) i).getType() == Potion.MEVIDA){
					vec[1]++;
				}else if(((Potion) i).getType() == Potion.MUIVIDA){
					vec[2]++;
				}else if(((Potion) i).getType() == Potion.FORCA){
					vec[3]++;
				}
			}
		}

		return vec;
	}
}
