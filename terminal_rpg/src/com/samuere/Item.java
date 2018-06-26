package com.samuere;

public class Item {

	/**
	 * Tudo encapsulado	
	 */
	private String name;
	private int effect;
	private String description;
	private int price;

	//Construtor
	public Item(String name, int effect, String description, int price) {
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

	public int getEffect() {
		return effect;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void use(Hero hero) {
		System.out.println("Voce usou o item " + getName());
	}


}
