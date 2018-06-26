package com.samuere;

public class Persona {


	/**
	 * Propriedades com encapsulamento
	 */
	private String name;
	private String description;
	private Attributes attributes;
	private Skill skills;
	private int experience;
	private int experienceToUp = 20;
	
	public int getExperienceToUp() {
		return experienceToUp;
	}

	public void setExperienceToUp() {
		this.experienceToUp = 2*experienceToUp;
	}

	public Persona(String name, String description, Attributes attributes, Skill skills, int experience) {
		this.name = name;
		this.description = description;
		this.attributes = attributes;
		this.skills = skills;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Skill getSkills() {
		return skills;
	}

	public void setSkills(Skill skills) {
		this.skills = skills;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int attack() {

		int damage = 0;
		damage = this.getAttributes().getDamage();
		return damage;
	}

	public int useSkill(Skill skills) {

		int damage = 0;
		damage = skills.use();
		// TODO:Implementar skills que alteram atributos do adversario.
		return damage;
	}

	public void Deffend(Attributes attributes, int damage) {
		int finalDamage = damage;
		finalDamage = finalDamage - attributes.getDefense();
	}
}
