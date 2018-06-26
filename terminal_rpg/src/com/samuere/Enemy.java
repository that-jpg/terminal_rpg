package com.samuere;

import java.util.ArrayList;

public class Enemy extends Persona {
	private ArrayList<Item> loot = new ArrayList<Item>();
	
	public Enemy(String name, String description, Attributes attributes, Skill skills, int experience, ArrayList<Item> loot) {
		super(name, description, attributes, skills, experience);
		this.loot = loot;
	}
	
	public ArrayList<Item> getLoot(){
		return loot;
	}

	public String getSkin(){
		String skin = "";

		if (this.getName().equalsIgnoreCase("goblin")){
			skin =  "             ,      , \n"+
					"            /(.-\"\"-.)\\ \n"+
					"        |\\  \\/      \\/  /| \n" +
					"        | \\ / =.  .= \\ / |     Eu sou o globin demoro, demoro mais abalo  \n" +
					"        \\( \\   o\\/o   / )/    Humildemente tocando o terror.\n" +
					"         \\_, '-/  \\-' ,_/   Sou o Demo Demorô, demorou mais abalou \n" +
					"           /   \\__/   \\ Sou vida louca, sangue bom do bagunca \n" +
					"           \\ \\__/\\__/ / Tenho até comunidade no Orkut\n" +
					"         ___\\ \\|--|/ /___ \n" +
					"       /`    \\      /    `\\ \n" +
					"      /       \'----\'       \\ \n";

		}else if (this.getName().equalsIgnoreCase("dragão")){
					skin = "                       .     _///_,\n"+
					"                     .      / ` \' \'>\n"+
					"                       )   o'  __/_\'>\n"+
					"                      (   /  _/  )_\'>				Depois que o expulsaram do senhor dos aneis,\n"+
					"                       \' \"__/   /_/\\_>\\ 		Ele jurou viganca...\n"+
					"                           ____/_/_/_/\\ 			O pior dragao de todos, \n"+
					"                          /,---, _/ /\\ \n"+
					"                         \"\"  /_/_/_/				(Exceto por sua sogra)\n"+
					"                            /_(_(_(_                 \\ \n"+
					"                           (   \\_\\_\\_               )\\ \n"+
					"                            \'__\\_\\_\\_\\__            ).\\ \n"+
					"                            //____|___\\__)           )_/\n"+
					"                            |  _  \'___'_(           /'\n"+
					"                             \\_ (-'\'___'_\\      __,'_'\n"+
					"                             __) \\  \\___(_   __/.__,'\n"+
					"                          ,((,-,__\\  '\", __\\_/. __,'\n"+
					"                                       '\"./_._._-'\n";


		}else if(this.getName().equalsIgnoreCase("lobo")){

			skin =  "*     *    *     /\\__/\\  *    ---    * \n"+
					"   *            /      \\    /     \\    \n"+
					"        *   *  |  -  -  |  |       |*   Desde os tempos mais primordios, existe \n"+
					" *   __________| \\     /|  |       |   uma duvida, uma pergunta sem reposta. \n"+
					"   /              \\ T / |   \\     /    \n"+
					" /                      |  *  ---  Voce finalmente encontrara a resposta, \n"+
					"|  ||     |    |       /             * Mas ficara vivo tempo suficiente para saber\n"+
					"|  ||    /______\\     / |*     * WHAT DOES THE FLOG SAY?!?\n"+
					"|  | \\  |  /     \\   /  |  Ring-ding-ding-ding-dingeringeding!\n" + 
					" \\/   | |\\ \\      | | \\ \\ Gering-ding-ding-ding-dingeringeding!\n"+
					"      | | \\ \\     | |  \\ \\ Gering-ding-ding-ding-dingeringeding!\n"+
					"      | |  \\ \\    | |   \\ \\ WHAT DOES THE FLOG SAY?!?\n"+
					"      '''   '''   '''    '''  \n";

		}else if(this.getName().equalsIgnoreCase("esqueleto")){
			skin =  "      .-. \n" +
					"     (o.o)           \n" +
					"      |=|    O Homem esqueleto ja foi um homem comum,        \n"+
					"     __|__   Ate que em um dia fatidico ele pulou de uma penhasco \n" +
					"   //.=|=.\\\\  Nesse momento a sua pele se abriu e a verdade foi revelada, \n"+
					"  // .=|=. \\\\ EXISTIA UM ESQUELETO DENTRO DO HOMEM \n"+
					"  \\\\ .=|=. // AJOELHE-SE PERANTE A FURIA \n"+
					"   \\\\(_=_)// DO HOMEM-ESQUELETO \n"+
					"    (:| |:) \n"+
					"     || || \n"+
					"     () () \n"+
					"     || || \n"+
					"     || || \n"+
					"    ==' '== \n";

		}else if(this.getName().equalsIgnoreCase("bandido")){			
			skin = "          __.------.                          \r\n                      (__  ___   )                         \r\n                        .)e  )\\\\ /                          \r\n                       /_.------                           \r\n                       _/_    _/                           \r\n                   __.'  / '   `-.__                       \r\n                  / <.--'           `\\\\                     \r\n                 /   \\\\   \\\\c           |                    \r\n                /    /    )  GoT  x    \\\\                   \r\n                |   /\\\\    |c     / \\\\.-  \\\\                  \r\n                \\\\__/  )  /(     (   \\\\   <>'\\\\               \r\n                     / _/ _\\\\-    `-. \\\\/_|_ /<>             \r\n                    / /--/,-\\\\     _ \\\\     <>.`.            \r\n                    \\\\/`--\\\\_._) - /   `-/\\\\    `.\\\\           \r\n                     /        `.     /   )     `\\\\          \r\n                     \\\\      \\\\   \\\\___/----'                 \r\n                     |      /    `(                        \r\n ___________         \\\\    ./\\\\_   _ \\\\                       \r\n   ______________    /     |  )    '|                      \r\n __________________ |     /   \\\\     \\\\     ___________      \r\n                   /     |     |____.)                     \r\n                  /      \\\\  a88a\\\\___/88888a.               \r\n                 \\\\_      :)8888888888888888888a.           \r\n                /` `-----'  `Y88888888888888888            \r\n                \\\\____|         `88888888888P'              \r\n                                                           \r\n     ";
			skin += "PASSA A GRANA! \n";
			skin += "OU TA HUNTED! \n";
		}

		return skin;
	}
}
