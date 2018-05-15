package com.samuere;

import com.samuere.menu.MenuAbstract;
import com.samuere.menu.MenuFactory;

import java.util.Scanner;

public class Engine {

    static Hero hero;

    public static MenuAbstract currentMenu;

    static Engine engine;

    public static boolean isGameOver() {
        return false;
    }

    public void displayMenu() {
        for (int i = 0; i < currentMenu.options.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + currentMenu.options.get(i).label);
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

	    MenuFactory menuManager = new MenuFactory();
	    Engine.currentMenu = menuManager.getMenu("start");

		while (!Engine.isGameOver()) {
            engine.displayMenu();
		    Engine.currentMenu.choose(scanner.nextInt());
		}
    }
}
