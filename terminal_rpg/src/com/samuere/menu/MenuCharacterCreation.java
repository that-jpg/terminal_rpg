package com.samuere.menu;

import com.samuere.menu.option.OptionFactory;

public class MenuCharacterCreation extends MenuAbstract{

    public MenuCharacterCreation() {
        super();
        this.name = "characterCreation";
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("continue"));
    }

}
