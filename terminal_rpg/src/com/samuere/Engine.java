package com.samuere;

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {

	Hero hero;

	private void _createHero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem vindo campeão, informe seu nome:");
		String name = sc.next();
		System.out.println("Conte-nos sua historia:");
		String description = sc.next();
		this.hero = new Hero(name, description, new ArrayList<Item>(), 1, 0);
	}

	private void _displayIntroHistory() {
		System.out.println("Hmmm... " + this.hero.getName());
		System.out.println("Ainda bem que você está aqui...");
		System.out.println("O Reino está em perigo e só você pode nos ajudar.");
	}

	private void _firstBattle() {
		Scanner sc = new Scanner(System.in);
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println("[Um pequeno dragão surge e te ataca furiosamente]");

		System.out.println("");
		System.out.println("    `.oo'    |    '");
		System.out.println(",.   (`-'    |    O Bixo");
		System.out.println("'^\\`-' )     |    parace furioso");
		System.out.println("  c-L'-      |");
		System.out.println("");

		System.out.println("O que você fará?");
		System.out.println("[1] Atacar");
		System.out.println("[2] Usar Item");
		System.out.println("[2] Fugir");

		int command = sc.nextInt();
		if (command == 1) {
			System.out.println("Você atacou o monstro causando " + hero.attack() + " e ele morre!");
			System.out.println("Você salvou o reino, Parabéns");
		} else if (command == 2) {
			System.out.println("Você tentou usar um item, mas lembrou que não possui nenhum.");
			System.out.println("O monstro te atacou e morrendo você se arrepende dessa decisão");
			System.out.println("[GAME OVER]");
		} else if (command == 3) {
			System.out.println("Você fugiu abandonando o reino, que foi destruido pela criatura.");
			System.out.println("Você ainda viverá por muitos anos, uma vida de remorso e tristeza.");
			System.out.println("[GAME OVER]");
		} else {
			System.out.println("Você tentou usar um comendo não válido.");
			System.out.println("Esse comando não válido seria um mortal para trás.");
			System.out.println("Você não possui essa habilidade, por isso quebrou o pescoço e morreu.");
			System.out.println("[GAME OVER]");
		}

	}

	private void start() {
		this._createHero();
		this._displayIntroHistory();
		this._firstBattle();
	}

	public static void main(String[] args) {
		Engine engine = new Engine();
		engine.start();
    }
}
