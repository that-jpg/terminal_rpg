package com.samuere.menu.option;

public class OptionExit extends Option {

    public OptionExit() {
        this.name = "exit";
        this.label = "Exit";
    }
    public void execute() {
        System.out.println("Muito Obrigado por jogar essa maravilha de jogo");
        System.exit(1);
    }
}
