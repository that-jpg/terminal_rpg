package com.samuere;

public class Weapon extends Item {

	private int type;
	private static final int SHIELD = 0;
	private static final int SWORD = 1;

	public Weapon(String name, int effect, String description, int price, int type) {
		super(name, effect, description, price);
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void equip(Attributes at) {
		if (type == SHIELD) {
			if (at.isShieldEquipped()) {
				System.out.println("O heroi ja possui um escudo equipado, desequipe-o primeiro");
			} else {
				at.setShieldEquipped(getEffect());
				System.out.println("Escudo " + getName() + " equipado");
			}
		}
		if (type == SWORD) {
			if (at.isSwordEquipped()) {
				System.out.println("O heroi ja possui uma espada equipada, desequipe-a primeiro");
			} else {
				at.setSwordEquipped(getEffect());
				System.out.println("Espada" + getName() + " equipada");
			}
		}
	}

	public void unequip(Attributes at) {
		if (type == SHIELD) {
			if (!at.isShieldEquipped()) {
				System.out.println("O heroi nao possui um escudo equipado, equipe-o primeiro");
			} else {
				at.setShieldEquipped(0);
				System.out.println("Escudo " + getName() + " desequipado");
			}
		}
		if (type == SWORD) {
			if (at.isSwordEquipped()) {
				System.out.println("O heroi nao possui uma espada equipada, equipe-a primeiro");
			} else {
				at.setSwordEquipped(0);
				System.out.println("Espada" + getName() + " desequipada");
			}
		}
	}

}
