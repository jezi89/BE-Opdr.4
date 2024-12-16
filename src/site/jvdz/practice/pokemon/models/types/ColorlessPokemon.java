package site.jvdz.practice.pokemon.models.types;

import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class ColorlessPokemon extends Pokemon {
	private String strength;
	private String weakness;

	public ColorlessPokemon(String name, int hp, int EvolutionStage, double weight, double height, String sound, String strength, String weakness) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = strength;
		this.weakness = weakness;
	}
	@Override
	public void attack () {
		System.out.println(getName() + " uses a Pound");
	}

	@Override
	public void defense () {
		System.out.println(getName() + " shields teammates with a Mat Block.");
	}

	@Override
	public void special () {
		System.out.println(getName() + " unleashes a blazing special move!");
	}

	public void typeBonus () {
		System.out.println("Colorless type bonus activated!");
	}

	// Getters and Setters for strength and weakness


	public String getStrength () {
		return "No specific strengths, but highly versatile. Versatility: Can use any Energy type for Colorless Energy costs.";
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}


	public String getWeakness () {
		return "Weakness: Colorless type.";
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
}
