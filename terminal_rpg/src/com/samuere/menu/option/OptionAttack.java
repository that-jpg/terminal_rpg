package com.samuere.menu.option;

public class OptionAttack extends Option {
    public OptionAttack() {
        this.name = "attack";
        this.label = "Attack";
    }
    public void execute() {
        System.out.println("Atacou");
    }
}
