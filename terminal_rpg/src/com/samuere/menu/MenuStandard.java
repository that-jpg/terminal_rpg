package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.menu.option.OptionFactory;

public class MenuStandard extends MenuAbstract {

	public MenuStandard() {
		super();
		this.name = "standard";
	}

	public void display() {
		String heroSkin = "   ,   A           {} \n" + "  / \\, | ,        .--. \n" + " |    =|= >      /.--.\\ \n"
				+ "  \\ /` | `       |====| \n" + "   `   |         |`::`|   \n"
				+ "       |     .-;`\\..../`;_.-^-._ \n" + "      /\\\\/  /  |...::..|`   :   `| \n"
				+ "      |:'\\ |   /'''::''|   .:.   | \n" + "       \\ /\\;-,/\\   ::  |..:::::..| \n"
				+ "       |\\ <` >  >._::_.| ':::::' | \n" + "       | `\"\"`  /   ^^  |   ':'   | \n"
				+ "       |       |       \\    :    / \n" + "       |       |        \\   :   /  \n"
				+ "       |       |___/\\___|`-.:.-` \n" + "       |        \\_ || _/    ` \n"
				+ "       |        <_ >< _> \n" + "       |        |  ||  | \n" + "       |        |  ||  | \n"
				+ "       |       _\\.:||:./_ \n" + "       |      /____/\\____\\ \n";

		System.out.println(heroSkin);
		System.out.println(Engine.hero.getName() + " Você está no nivel " + Engine.hero.getLevel());
		System.out.println("Experiencia: " + Engine.hero.getExperience() + "/" + Engine.hero.getExperienceToUp());
		System.out.println("Voce está em: " + Engine.currentRegion.getName() + "\n");
	}

	public void initOptions() {
		OptionFactory optFactory = new OptionFactory();
		this.options.add(optFactory.getOption("travel"));
		this.options.add(optFactory.getOption("search"));
		if (Engine.currentRegion.getName() == "Cidade")
			this.options.add(optFactory.getOption("goToMarket"));
		this.options.add(optFactory.getOption("inventory"));
		if (Engine.hero != null && Engine.hero.getEnemiesDefeated() >= 6)
			this.options.add(optFactory.getOption("boss"));
		this.options.add(optFactory.getOption("exit"));
	}

}
