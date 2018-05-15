package com.samuere.menu.option;

import java.util.ArrayList;

public class OptionFactory {
    ArrayList<Option> options = new ArrayList<Option>();

    public OptionFactory() {
        OptionStartGame optStartGame = new OptionStartGame();
        options.add(optStartGame);

        OptionAbout optAbout = new OptionAbout();
        options.add(optAbout);

        OptionExit optExit = new OptionExit();
        options.add(optExit);

        OptionBackToStartMenu optionBackToStartMenu = new OptionBackToStartMenu();
        options.add(optionBackToStartMenu);
        // backToStartMenu
    }

    public Option getOption(String name) {
        for (Option opt : this.options) {
            if(name.equals(opt.name)) {
                return opt;
            }
        }
        System.err.println("You tried to get an option that do not exist :/");
        return null;
    }
}
