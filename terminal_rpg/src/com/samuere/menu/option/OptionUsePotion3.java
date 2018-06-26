package com.samuere.menu.option;

import com.samuere.Battle;
import com.samuere.Engine;
import com.samuere.Potion;

public class OptionUsePotion3 extends Option{
    public OptionUsePotion3() {
        this.name = "usePotion3";
        this.label = "Recupera muita vida";
    }
    public void execute() {
      if(Engine.hero.allPotions()[2] == 0){
			Engine.error = "Voc� n�o possui essa po��o!";
      } else{
    	  Battle.usePotion(Potion.MUIVIDA);
      }
    }
}
