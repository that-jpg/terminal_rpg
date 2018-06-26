package com.samuere;

import com.samuere.*;
import com.samuere.menu.MenuFactory;

import java.util.Random;

public class Battle {
	public static void attack(Persona p1, Persona p2) {
		Random rand = new Random();
		int dano;
		int vida;

		if(p1 instanceof Hero){
			dano = p1.getAttributes().getDamage()*(rand.nextInt(((Hero)p1).getLevel()+10));
			vida = p2.getAttributes().getActualHealth();

		}else{
			dano = p1.getAttributes().getDamage() - p2.getAttributes().getDefense()*(((Hero)p2).getLevel()+10);
			if(dano < 0){
				dano = 1;

			}
			vida = p2.getAttributes().getActualHealth();

		}

		vida = vida - dano;
		p2.getAttributes().setActualHealth(vida);
	}
	
	public static void usePotion(int type) {
        for(Item a : Engine.hero.getItems())
            if(a instanceof Potion){
          	Potion pot = (Potion)a;
              if(pot.getType() == type)
                pot.use(Engine.hero.getAttributes());
                Engine.hero.removeItem(a);
                break;
            }
	}
	
	public static void getEnemyLoot() {
		for(Item a : Engine.currentEnemy.getLoot()) {
			if(a.getName() == "Money")
				Engine.hero.setMoney(Engine.hero.getMoney() + a.getPrice());
			else
				Engine.hero.addItem(a);
		}
	}
}
