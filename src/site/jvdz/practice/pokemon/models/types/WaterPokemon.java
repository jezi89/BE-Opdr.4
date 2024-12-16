package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves; 
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class WaterPokemon extends Pokemon implements Moves {
	private final String strength;
	private final String weakness;

	public WaterPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = "Water";
		this.weakness = "Lightning";
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

	@Override
	public void bonusMove() {
		System.out.println(getName() + " surges forward with a powerful Hydro Pump!");
	}

	public void typeBonus() {
		System.out.println("Water type bonus activated! Healing effects boosted in rain!");
	}

	// Getters and Setters for strength and weakness
	public String getStrength() {
		return strength;
	}

	public String getWeakness() {
		return weakness;
	}


}


/*
package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves; 

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
