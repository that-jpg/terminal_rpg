package com.samuere.menu.option;

public class OptionExit extends Option {

    public OptionExit() {
        this.name = "exit";
        this.label = "Exit";
    }
    public void execute() {
		for (int i = 0; i < 100; i++)
			System.out.println();
        System.out.print("\u001B[31m");
        System.out.println("                   *              )               (");
        System.out.println(" (        (      (  `          ( /(               )\\ )  ");
        System.out.println(" )\\ )     )\\     )\\))(   (     )\\()) (   (   (   (()/(  ");
        System.out.println("(()/(  ((((_)(  ((_)()\\  )\\   ((_)\\  )\\  )\\  )\\   /(_)) ");
        System.out.println(" /(_))_ )\\ _ )\\ (_()((_)((_)    ((_)((_)((_)((_) (_))   ");
        System.out.println("(_)) __|(_)_\\(_)|  \\/  || __|  / _ \\\\ \\ / / | __|| _ \\  ");
        System.out.println("  | (_ | / _ \\  | |\\/| || _|  | (_) |\\ V /  | _| |   /  ");
        System.out.println("   \\___|/_/ \\_\\ |_|  |_||___|  \\___/  \\_/   |___||_|_\\  ");

        System.out.println();

        System.out.println("Muito Obrigado por jogar essa maravilha de jogo");
        System.exit(1);
    }
}
