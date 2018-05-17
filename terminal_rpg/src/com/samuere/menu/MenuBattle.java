package com.samuere.menu;

import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuBattle extends MenuAbstract{

    public MenuBattle() {
        super();
        this.name = "battle";
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("attack"));
        this.options.add(optFactory.getOption("run"));
    }

}
