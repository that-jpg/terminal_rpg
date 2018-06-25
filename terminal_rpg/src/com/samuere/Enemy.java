package com.samuere;

import java.util.ArrayList;

public class Enemy extends Persona{

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
					"        | \\ / =.  .= \\ / | \n" +
					"        \\( \\   o\\/o   / )/ \n" +
					"         \\_, '-/  \\-' ,_/ \n" +
					"           /   \\__/   \\ \n" +
					"           \\ \\__/\\__/ / \n" +
					"         ___\\ \\|--|/ /___ \n" +
					"       /`    \\      /    `\\ \n" +
					"      /       \'----\'       \\ \n";

		}else if (this.getName().equalsIgnoreCase("dragão")){
					skin = "                       .     _///_,\n"+
					"                     .      / ` \' \'>\n"+
					"                       )   o'  __/_\'>\n"+
					"                      (   /  _/  )_\'>\n"+
					"                       \' \"__/   /_/\\_>\\ \n"+
					"                           ____/_/_/_/\\ \n"+
					"                          /,---, _/ /\\ \n"+
					"                         \"\"  /_/_/_/\n"+
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
					"        *   *  |  -  -  |  |       |*   \n"+
					" *   __________| \\     /|  |       |    \n"+
					"   /              \\ T / |   \\     /    \n"+
					" /                      |  *  --- \n"+
					"|  ||     |    |       /             *\n"+
					"|  ||    /______\\     / |*     * \n"+
					"|  | \\  |  /     \\   /  | \n"+
					" \\/   | |\\ \\      | | \\ \\ \n"+
					"      | | \\ \\     | |  \\ \\ \n"+
					"      | |  \\ \\    | |   \\ \\ \n"+
					"      '''   '''   '''    '''  \n";

		}else if(this.getName().equalsIgnoreCase("esqueleto")){
			skin =  "      .-. \n" +
					"     (o.o) \n" +
					"      |=| \n"+
					"     __|__ \n" +
					"   //.=|=.\\\\ \n"+
					"  // .=|=. \\\\ \n"+
					"  \\\\ .=|=. // \n"+
					"   \\\\(_=_)// \n"+
					"    (:| |:) \n"+
					"     || || \n"+
					"     () () \n"+
					"     || || \n"+
					"     || || \n"+
					"    ==' '== \n";

		}else if(this.getName().equalsIgnoreCase("bandido")){
			skin = "          __.------.                          \r\n                      (__  ___   )                         \r\n                        .)e  )\\\\ /                          \r\n                       /_.------                           \r\n                       _/_    _/                           \r\n                   __.'  / '   `-.__                       \r\n                  / <.--'           `\\\\                     \r\n                 /   \\\\   \\\\c           |                    \r\n                /    /    )  GoT  x    \\\\                   \r\n                |   /\\\\    |c     / \\\\.-  \\\\                  \r\n                \\\\__/  )  /(     (   \\\\   <>'\\\\               \r\n                     / _/ _\\\\-    `-. \\\\/_|_ /<>             \r\n                    / /--/,-\\\\     _ \\\\     <>.`.            \r\n                    \\\\/`--\\\\_._) - /   `-/\\\\    `.\\\\           \r\n                     /        `.     /   )     `\\\\          \r\n                     \\\\      \\\\   \\\\___/----'                 \r\n                     |      /    `(                        \r\n ___________         \\\\    ./\\\\_   _ \\\\                       \r\n   ______________    /     |  )    '|                      \r\n __________________ |     /   \\\\     \\\\     ___________      \r\n                   /     |     |____.)                     \r\n                  /      \\\\  a88a\\\\___/88888a.               \r\n                 \\\\_      :)8888888888888888888a.           \r\n                /` `-----'  `Y88888888888888888            \r\n                \\\\____|         `88888888888P'              \r\n                                                           \r\n     ";
		}

		return skin;
	}
}