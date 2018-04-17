package com.samuere;

public class Potion extends Item {

	private int duration;
	private int preparation;


	public Potion(String name, String effect, String descreption, double price, int duration, int preparation) {
		super(name, effect, descreption, price);
		this.duration = duration;
		this.preparation = preparation;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public int getPreparation() {
		return preparation;
	}


	public void setPreparation(int preparation) {
		this.preparation = preparation;
	}



}

