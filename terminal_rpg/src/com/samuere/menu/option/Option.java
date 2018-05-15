package com.samuere.menu.option;

public class Option {
    public String label;
    public String name;
    public void execute() {
        System.err.println("Should be implemented by subclasses");
    }
}
