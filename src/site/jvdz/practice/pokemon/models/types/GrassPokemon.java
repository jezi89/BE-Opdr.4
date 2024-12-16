package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class GrassPokemon extends Pokemon {
	private String strength;
	private String weakness;

	public GrassPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound, String Strength, String weakness) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = strength;
		this.weakness = weakness;
	}


	@Override
	public void attack() {
		System.out.println(getName() + " slashes with Razor Leaf!");
	}

	@Override
	public void defense() {
		System.out.println(getName() + " restores health with Synthesis.");
	}

	@Override
	public void special() {
		System.out.println(getName() + " traps the enemy with a Vine Whip!");
	}

	public void typeBonus() {
		System.out.println("Grass type bonus activated: Healing over time!");
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
