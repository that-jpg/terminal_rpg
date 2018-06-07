package com.samuere.menu;

import com.samuere.menu.option.Option;

import java.util.ArrayList;

public class MenuAbstract {
    public String name;
    public ArrayList<Option> options = new ArrayList<Option>();

    public MenuAbstract() {
        this.initOptions();
    }
    
    public void display() {
    	
    }

    public void choose(int nthOption) {
        if (nthOption <= this.options.size()) {
            this.options.get(nthOption - 1).execute();
        }
    }

    public void initOptions() {
        System.err.println("Must be implemented by its subclasses");
    }
}
