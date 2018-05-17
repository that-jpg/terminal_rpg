package com.samuere.menu;

import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuStandard extends MenuAbstract{

    public MenuStandard() {
        super();
        this.name = "standard";
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("travel"));
        this.options.add(optFactory.getOption("search"));
        this.options.add(optFactory.getOption("exit"));
    }

}
