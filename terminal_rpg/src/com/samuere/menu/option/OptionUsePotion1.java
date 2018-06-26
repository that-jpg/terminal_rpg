package com.samuere.menu.option;

import com.samuere.*;

public class OptionUsePotion1 extends Option{
    public OptionUsePotion1() {
        this.name = "usePotion1";
        this.label = "Recupera pouca vida";
    }
    public void execute() {
    	System.out.println(Engine.hero.allPotions()[0]);
      if(Engine.hero.allPotions()[0] == 0){
			Engine.error = "Voc� n�o possui essa po��o!";
      } else {
    	  Battle.usePotion(Potion.PVIDA);
      }
    }
}
