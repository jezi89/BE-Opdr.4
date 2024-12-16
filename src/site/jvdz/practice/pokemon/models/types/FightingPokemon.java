package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves; 
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class FightingPokemon extends Pokemon implements Moves {
	private final String strength;
	private final String weakness;

	public FightingPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = "Lightning, Colorless";
		this.weakness = "Grass, Psychic";
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

	@Override
	public void bonusMove() {
		System.out.println(getName() + " uses a devastating Earthquake!");
	}

	public void typeBonus() {
		System.out.println("Fighting type bonus activated! Physical strength boosted!");
	}

	// Getters and Setters for strength and weakness
	public String getStrength() {
		return strength;
	}

	public String getWeakness() {
		return weakness;
	}


}
