package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.Hero;
import com.samuere.Item;
import com.samuere.menu.MenuFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class OptionStartGame extends Option {
    public OptionStartGame() {
        this.name = "start";
        this.label = "Start";
    }
    public void execute() {
        Scanner sc = new Scanner(System.in);
        MenuFactory menuFactory = new MenuFactory();
        String name, description;

        System.out.println("SEJA BEM VINDO AO JOGO MAIS INCRIVEL DE TODOS OS JOGOS!!\n");
        System.out.println("Qual é o seu nome aventureiro?");
        name = sc.next();

        System.out.println("Qual é a sua historia?");
        description = sc.next();

        Hero hero = new Hero(name, description);

        Engine.hero = hero;




        Engine.currentMenu = menuFactory.getMenu("characterCreation");
    }
}
