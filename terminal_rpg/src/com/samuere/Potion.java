package com.samuere;

public class Potion extends Item {

	public static final int PVIDA = 0;
	public static final int MEVIDA = 1;
	public static final int MUIVIDA = 2;
	public static final int FORCA = 3;
	private int type;

	public Potion(String name, int effect, String description, int price, int type) {
		super(name, effect, description, price);
		this.type = type;

	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPVIDA() {
		return PVIDA;
	}

	public int getMEVIDA() {
		return MEVIDA;
	}

	public int getMUIVIDA() {
		return MUIVIDA;
	}

	public int getFORCA() {
		return FORCA;
	}

	public void use(Attributes at) {
		int health = at.getActualHealth();

		if (type == FORCA) {
			// Aumenta a forca durante a batalha
			int forca = at.getActualStrenght();
			forca = forca + getEffect();
			at.setActualStrenght(forca);
			System.out.println("Você usou a poção " + getName());

		} else {
			// Aumenta a saude do heroi de acordo com o efeito da po��o
			if (at.getActualHealth() < at.getMaxHealth()) {
				health = health + getEffect();
				if (health > at.getMaxHealth())
					at.setActualHealth(at.getMaxHealth());
				else
					at.setActualHealth(health);
				System.out.println("Você usou a poção " + getName());
			} else {
				System.out.println("Sua vida já está cheia!!");
			}
		}
	}

}
