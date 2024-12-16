package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class FightingPokemon extends Pokemon {
	private String strength;
	private String weakness;

	public FightingPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound, String strength, String weakness) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = strength;
		this.weakness = weakness;
	}


	@Override
	public void attack() {
		System.out.println(getName() + " uses a Karate Chop");
	}

	@Override
	public void defense() {
		System.out.println(getName() + " raises its defenses with Bulk Up.");
	}

	@Override
	public void special() {
		System.out.println(getName() + " unleashes a devastating Close Combat!");
	}

	public void typeBonus() {
		System.out.println("Fighting type bonus activated!");
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
