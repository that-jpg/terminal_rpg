package com.samuere.menu.option;

import com.samuere.Battle;
import com.samuere.*;

public class OptionUsePotion2 extends Option{
    public OptionUsePotion2() {
        this.name = "usePotion2";
        this.label = "Recupera média vida";
    }
    public void execute() {
      if(Engine.hero.allPotions()[1] == 0){
        System.out.println("Você não possui essa poção!\n");
      } else {
    	  Battle.usePotion(Potion.MEVIDA);
      }
    }
}
