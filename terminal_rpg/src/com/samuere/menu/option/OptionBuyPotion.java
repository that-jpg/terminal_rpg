package com.samuere.menu.option;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

import com.samuere.Engine;
import com.samuere.*;

public class OptionBuyPotion extends Option {
	public OptionBuyPotion() {
		this.name = "buyPotion";
		this.label = "Comprar po��es";
	}

	public void execute() {
		for (int i = 0; i < 100; i++)
			System.out.println();
		ArrayList<Potion> potions = new ArrayList<Potion>();
		for (int i = 1; i < 5; i++) {
			if (i != 4)
				potions.add(
						new Potion("Po��o do tipo " + i, (int) Math.ceil((i * 0.25 * Engine.hero.getAttributes().getMaxHealth())),
								"Lala", i * 5, i - 1));
			else
				potions.add(new Potion("Po��o do tipo " + i, (int) Math.ceil((0.1 * Engine.hero.getAttributes().getStrenght())), "Lala",
						i * 5, i - 1));
		}
		System.out.printf(".---.  .-.   .-.    _\n" + "|~~~| .'~`. .' `. .'~`.\n" + "| 1 | | 2 | | 3 | : 4 :\n"
				+ "|___| |___| `._.' :___:\n" + "  ");
		for (int x : Engine.hero.allPotions())
			System.out.printf("%d     ", x);
		System.out.printf(
				"\n[1] Recupera 0.25 da vida - Pre�o: %d\n[2] Recupera 0.50 da vida - Pre�o: %d\n[3] Recupera 0.75 da vida - Pre�o: %d\n[4] Aumenta forca em 0.10 durante a batalha - Pre�o: %d",
				potions.get(0).getPrice(), potions.get(1).getPrice(), potions.get(2).getPrice(),
				potions.get(3).getPrice());
		System.out.println("\nDigite o tipo da po��o desejada: ");
		Scanner input = new Scanner(System.in);
		int tipo = input.nextInt();
		System.out.println("Digite a quantidade de po��es desejadas: ");
		int quantidade = input.nextInt();

		try{
			Potion p = potions.get(tipo - 1);
			if ((quantidade * p.getPrice()) > Engine.hero.getMoney())
				Engine.error = "Voc� n�o possui dinheiro sulficiente!";
			else {
				for (int i = 0; i < quantidade; i++) {
					Engine.hero.addItem(p);
				}
				int troco = Engine.hero.getMoney() - quantidade * p.getPrice();
				Engine.hero.setMoney(troco);
				System.out.println("Voc� comprou " + quantidade + " po��es do tipo " + tipo + "!");
			}
		} catch(Exception IndexOutOfBoundsException) {
			Engine.error = "Essa poção não existe";
		}
	}
}
