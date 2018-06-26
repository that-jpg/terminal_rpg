package com.samuere.menu.option;

import com.samuere.*;

public class OptionUsePotion2 extends Option{
    public OptionUsePotion2() {
        this.name = "usePotion2";
        this.label = "Recupera m�dia vida";
    }
    public void execute() {
      if(Engine.hero.allPotions()[1] == 0){
			Engine.error = "Voc� n�o possui essa po��o!";
      } else {
    	  Battle.usePotion(Potion.MEVIDA);
      }
    }
}
