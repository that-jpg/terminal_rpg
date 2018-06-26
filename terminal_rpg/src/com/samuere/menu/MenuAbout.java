package com.samuere.menu;

import com.samuere.menu.option.OptionFactory;

public class MenuAbout extends MenuAbstract{

    public MenuAbout() {
        super();
        this.name = "about";
    }
    
    public void display() {
        System.out.println("Esse jogo foi desenvolvido com muito amor");
        System.out.println("Nossos integrantes sao:");
        System.out.println("- Erick Kuissumoto do Nascimento");
        System.out.println("- Gabriela Vitoria Rezzo de Souza");
        System.out.println("- Jose Philipe Mendes de Godoy");
        System.out.println("- Marcelo Martins Vilela Filho");
        System.out.println("- Samuel Batista de Souza");
        System.out.println("");        
        System.out.println("Esse projeto foi uma maneira divertida de aplicar os conceitos ensinados");
        System.out.println("pelo Prof. Ph.D. Julio Cesar Dos Reis nas aulas de MC302 - 1 Semestre 2018");             
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("backToStartMenu"));
    }

}
