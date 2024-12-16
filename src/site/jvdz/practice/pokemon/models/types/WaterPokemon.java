package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class WaterPokemon extends Pokemon {
	private String strength;
	private String weakness;

	public WaterPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound, String Strength, String weakness) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = strength;
		this.weakness = weakness;
	}


	@Override
	public void attack() {
		System.out.println(getName() + " strikes with a powerful Water Gun!");
	}

	@Override
	public void defense() {
		System.out.println(getName() + " protects itself with Aqua Ring.");
	}

	@Override
	public void special() {
		System.out.println(getName() + " drowns the battlefield in a Hydro Pump!");
	}

	public void typeBonus() {
		System.out.println("Water type bonus activated: Damage reduction from fire attacks!");
	}

	// Getters and Setters for strength and weakness
	public String getStrength() {
		return strength;
	}

	public void setStrength(String Strength) {
		this.strength = strength;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
}


/*
package site.jvdz.practice.pokemon.models.types;

import site.jvdz.practice.pokemon.interfaces.PokemonTypes;

public class WaterPokemon implements PokemonTypes {
	@Override
	public String getTypeName() {
		return "Water";
	}

	@Override
	public String getStrength() {
		return "Fire, Rock, Ground";
	}

	@Override
	public String getWeakness() {
		return "Electric, Grass";
	}
}
*/
