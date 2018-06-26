package com.samuere.menu.option;

import com.samuere.Attributes;
import com.samuere.Enemy;
import com.samuere.Engine;
import com.samuere.Skill;
import com.samuere.menu.MenuFactory;

public class OptionBoss extends Option{
    public OptionBoss() {
        this.name = "boss";
        this.label = "ENFRENTAR O BOSS";
    }
    public void execute() {
    	Engine.currentEnemy = new Enemy("boss", "Animal Silvestre", new Attributes(1, 5, 5, 5, 5), new Skill(), 10, null);
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("battle");
    }
}
