package com.samuere.menu;

import com.samuere.menu.option.OptionFactory;

public class MenuAbout extends MenuAbstract{

    public MenuAbout() {
        super();
        this.name = "about";
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("backToStartMenu"));
    }

}
