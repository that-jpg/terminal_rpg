
package com.samuere;

import java.util.ArrayList;

public class Region {
	private String name;
	private int minLevel;
	public ArrayList<Enemy> enemies;

	public Region(String name, int minLevel, ArrayList<Enemy> enemies) {
		this.name = name;
		this.minLevel = minLevel;
		this.enemies = enemies;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public int getMinLevel() {
		return this.minLevel;
	}

	public void setMinLevel(int value) {
		this.minLevel = value;
	}

	public void removeEnemy(Enemy e) {
			enemies.remove(e);
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

}
