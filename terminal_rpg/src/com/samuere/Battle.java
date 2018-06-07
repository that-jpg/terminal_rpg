package com.samuere;

import com.samuere.*;
import com.samuere.menu.MenuFactory;

public class Battle {
	public static void attack(Persona p1, Persona p2) {
		int dano = p1.getAttributes().getDamage();
		int vida = p2.getAttributes().getActualHealth();
		
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
