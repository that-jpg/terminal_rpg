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
        System.out.println("Você não possui essa poção!\n");
      } else{
    	  Battle.usePotion(Potion.MUIVIDA);
      }
    }
}
