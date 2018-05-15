package com.samuere;

import java.util.ArrayList;

public class MenuManager {
// public void handleInput()

    ArrayList<Menu> menus = new ArrayList<Menu>();

    static Menu currentSelected;


    public void handleInput(int nth) {
        try {
           MenuManager.currentSelected.choose(nth);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public MenuManager() {
        ArrayList<Option> startOptions = new ArrayList<Option>();
        Option start = new Option("Start", Engine.engine, "start");
        startOptions.add(start);
        menus.add(new Menu(startOptions));
        MenuManager.currentSelected = menus.get(0);
    }

    class Menu {

        public ArrayList<Option> options;

        Menu(ArrayList<Option> options) {
           this.options = options;
        }

        public void choose(int nthOption) throws Exception {
            if (nthOption <= this.options.size()) {
                Option option = options.get(nthOption - 1);
                option.context.getClass().getDeclaredMethod(option.action).invoke(new Object());
            }
        }


    }

    class Option {
        String label;
        Object context;
        String action;
        Option(String label, Object context, String action) {
            this.label = label;
            this.context = context;
            this.action = action;
        }
    }

}
