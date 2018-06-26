package com.samuere.menu.option;

import java.util.ArrayList;

public class OptionFactory {
	
	
	/**
	 * Lista com todas as options que existem no jogo
	 */
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
        
        OptionGoToMarket optionMarket = new OptionGoToMarket();
        options.add(optionMarket);

        OptionSearchEnemy optionSearchEnemy = new OptionSearchEnemy();
        options.add(optionSearchEnemy);
        
        OptionInventory optionInventory = new OptionInventory();
        options.add(optionInventory);

        OptionListRegions optionListRegions = new OptionListRegions();
        options.add(optionListRegions);

        OptionBackToStandardMenu optionBackToStandardMenu = new OptionBackToStandardMenu();
        options.add(optionBackToStandardMenu);

        OptionBuyPotion optionBuyPotion = new OptionBuyPotion();
        options.add(optionBuyPotion);

        OptionAttack optionAttack = new OptionAttack();
        options.add(optionAttack);

        OptionPotions optionPotions = new OptionPotions();
        options.add(optionPotions);

        OptionUsePotion1 optionUsePotion1 = new OptionUsePotion1();
        options.add(optionUsePotion1);

        OptionUsePotion2 optionUsePotion2 = new OptionUsePotion2();
        options.add(optionUsePotion2);

        OptionUsePotion3 optionUsePotion3 = new OptionUsePotion3();
        options.add(optionUsePotion3);

        OptionUsePotion4 optionUsePotion4 = new OptionUsePotion4();
        options.add(optionUsePotion4);
        
        OptionBackToBattle optionBackToBattle = new OptionBackToBattle();
        options.add(optionBackToBattle);

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
        System.err.println("You tried to get an option that do not exist :/" );
        return null;
    }
}
