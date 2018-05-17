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
        
        OptionTravel optionTravel = new OptionTravel();
        options.add(optionTravel);
        
        OptionSearchEnemy optionSearchEnemy = new OptionSearchEnemy();
        options.add(optionSearchEnemy);
        
        OptionListRegions optionListRegions = new OptionListRegions();
        options.add(optionListRegions);
        
        OptionBackToStandardMenu optionBackToStandardMenu = new OptionBackToStandardMenu();
        options.add(optionBackToStandardMenu);
        
        OptionAttack optionAttack = new OptionAttack();
        options.add(optionAttack);
        
        OptionRun optionRun = new OptionRun();
        options.add(optionRun);
        
        OptionContinue optionContinue = new OptionContinue();
        options.add(optionContinue);
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
