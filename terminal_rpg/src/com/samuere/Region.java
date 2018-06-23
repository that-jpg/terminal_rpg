
package com.samuere;
import java.util.ArrayList;


public class Region {
	private String name;
	private String description;
	private int minLevel;
	private int maxLevel;
	public ArrayList<Enemy> enemies;
	private String type;
	public Region(String name, String description, int minLevel, int maxLevel, ArrayList<Enemy> enemies,  String type) {
		this.name = name;
		this.description = description;
		this.minLevel = minLevel;
		this.maxLevel = maxLevel;
		this.enemies = enemies;
		this.type = type;
	}

	public String getName() {
		return this.name ;
	}

	public void setName(String value) {
			this.name = value;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String value) {
		this.description = value;
	}

	public int getMinLevel() {
		return this.minLevel;
	}
	public void setMinLevel(int value) {
		this.minLevel = value;
	}

	public int getMaxLevel() {
		return this.maxLevel;
	}
	public void setMaxLevel(int value) {
		this.maxLevel = value;
	}

	/**
	 * @return
	 */
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}

	/**
	 * @param value
	 */
	public void setEnemies(ArrayList<Enemy> value) {

	}

	/**
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param value
	 */
	public void setType(String value) {
		this.type = value;
	}

}
