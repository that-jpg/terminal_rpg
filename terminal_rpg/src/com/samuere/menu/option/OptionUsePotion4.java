package com.samuere.menu.option;

import com.samuere.Battle;
import com.samuere.Engine;
import com.samuere.Potion;

public class OptionUsePotion4 extends Option{
    public OptionUsePotion4() {
        this.name = "usePotion4";
        this.label = "Aumenta for�a durante a batalha";
    }
    public void execute() {
      if(Engine.hero.allPotions()[3] == 0){
			Engine.error = "Voc� n�o possui essa po��o!";
      } else {
    	  Battle.usePotion(Potion.FORCA);
      }
    }
}
