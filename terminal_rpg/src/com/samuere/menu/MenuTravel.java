package com.samuere.menu;

import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuTravel extends MenuAbstract{

    public MenuTravel() {
        super();
        this.name = "travel";
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("listRegions"));
        this.options.add(optFactory.getOption("backToStandardMenu"));
    }

}
