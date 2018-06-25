package com.samuere;

import java.util.ArrayList;
import java.util.Random;

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
			Random rand = new Random();
			newExperience = newExperience - this.getExperienceToUp();
			this.setExperience(newExperience);
			this.setLevel(this.getLevel() + 1);
			setExperienceToUp();
			System.out.println("Você evoluiu para o nivel " + this.getLevel());
			int[] atributeIncrease = new int[6];
			for(int i  = 0; i < 6 ; i++){
				atributeIncrease[i] = rand.nextInt(this.getLevel()+3);
			}
			this.getAttributes().setMaxHealth(this.getAttributes().getMaxHealth() + atributeIncrease [1]);
			this.getAttributes().setActualHealth(this.getAttributes().getMaxHealth());
			this.getAttributes().setStrenght(this.getAttributes().getStrenght() + atributeIncrease[0]);
			this.getAttributes().setCharisma(this.getAttributes().getCharisma() + atributeIncrease[2]);
			this.getAttributes().setDefense(this.getAttributes().getDefense() + atributeIncrease[3]);
			this.getAttributes().setLuck(this.getAttributes().getLuck() + atributeIncrease[4]);

			System.out.println("Sua Vida máxima foi aumentada em + " + atributeIncrease[1]);
			System.out.println("Sua Força foi aumentada em + " + atributeIncrease[0]);
			System.out.println("Seu Carisma foi aumentado em + " + atributeIncrease[2]);
			System.out.println("Sua Defesa foi aumentada em + " + atributeIncrease[3]);
			System.out.println("Sua Sorte foi aumentada em + " + atributeIncrease[4]);
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
