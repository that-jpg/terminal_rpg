package com.samuere.menu.option;

public class OptionStartGame extends Option {
    public OptionStartGame() {
        this.name = "start";
        this.label = "Start";
    }
    public void execute() {
        System.out.println("O jogo esta comecando");
    }
}
