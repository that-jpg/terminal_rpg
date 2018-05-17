package com.samuere.menu;

import java.util.ArrayList;

public class MenuFactory {

    ArrayList<MenuAbstract> menus = new ArrayList<MenuAbstract>();

    public MenuFactory() {
       MenuStart menuStart = new MenuStart();
       menus.add(menuStart);

       MenuAbout menuAbout = new MenuAbout();
       menus.add(menuAbout);
       
       MenuStandard menuStandard = new MenuStandard();
       menus.add(menuStandard);
       
       MenuTravel menuTravel = new MenuTravel();
       menus.add(menuTravel);
       
       MenuBattle menuBattle = new MenuBattle();
       menus.add(menuBattle);
       
       MenuCharacterCreation menuCharacterCreation = new MenuCharacterCreation();
       menus.add(menuCharacterCreation);
    }

    public MenuAbstract getMenu(String menuName) {
        for (MenuAbstract m : menus) {
            if (menuName.equals(m.name)){
                return m;
            }
        }
        return null;
    }
}
