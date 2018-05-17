package com.samuere.menu;

import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuStart extends MenuAbstract{

    public MenuStart() {
        super();
        this.name = "start";
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("start"));
        this.options.add(optFactory.getOption("about"));
        this.options.add(optFactory.getOption("exit"));
    }

}
