package com.samuere;

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {

    static Hero hero;

    static Engine engine;

    public static boolean isGameOver() {
        return false;
    }

    public void displayMenu(MenuManager.Menu menu) {
        System.out.println("...");
        for (MenuManager.Option opt : menu.options) {
            System.out.println("...");
            System.out.println(opt.label);
        }
    }

    private void start() {
        System.out.println("##### Terminal RPG #####");
        System.out.println();
	}

    private void about() {
        System.out.println("Feito com amor");
    }

    private void sair() {
        System.out.println("Muito obrigado por jogar conosco :D");
        System.exit(1);
    }

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Engine engine = new Engine();
	    Engine.engine = engine;

	    MenuManager menuManager = new MenuManager();
	    engine.displayMenu(MenuManager.currentSelected);
		while (!Engine.isGameOver()) {
		    menuManager.handleInput(scanner.nextInt());
            engine.displayMenu(MenuManager.currentSelected);

		}
    }
}
