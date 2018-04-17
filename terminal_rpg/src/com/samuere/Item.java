package com.samuere;

public class Item {

	private String name;
	private String effect;
	private String description;
	private double price;

	//Construtor
	public Item(String name, String effect, String description, double price) {
		this.name = name;
		this.effect = effect;
		this.description = description;
		this.price = price;
	}

	//Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void use(Hero hero) {
		System.out.println("Você usou o item " + getName());
	}


}

