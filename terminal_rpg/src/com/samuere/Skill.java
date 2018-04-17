package com.samuere;

/**
 *
 */
public class Skill {

	/**
	 * Default constructor
	 */
	public Skill() {
	}

	/**
	 *
	 */
	private String effect;

	/**
	 *
	 */
	private String name;

	/**
	 *
	 */
	private String description;

	/**
	 *
	 */
	private float basicDamage;


	/**
	 *
	 */
	public void Skill() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getEffect() {
		// TODO implement here
		return "";
	}

	/**
	 * @param value
	 */
	public void setEffect(String value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getName() {
		// TODO implement here
		return "";
	}

	/**
	 * @param value
	 */
	public void setName(String value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getDescription() {
		// TODO implement here
		return "";
	}

	/**
	 * @param value
	 */
	public void setDescription(String value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public float getBasicDamage() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param value
	 */
	public void setBasicDamage(float value) {
		// TODO implement here
	}

	public int use() {
		System.out.println("Using the skill");
		return 1;
	}

}
