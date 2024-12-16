package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves;
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class ColorlessPokemon extends Pokemon implements Moves {
	private final String strength;
	private final String weakness;

	public ColorlessPokemon(String name, int hp, int EvolutionStage, double weight, double height, String sound) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = "Geen specifieke strengths (neutral tegen de meeste types).";
		this.weakness = "Fighting";
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

	@Override
	public void bonusMove() {
		System.out.println(getName() + " uses a powerful Hyper Beam!");
	}

	public void typeBonus() {
		System.out.println("Colorless type bonus activated!");
	}

	// Getters and Setters for strength and weakness


	public String getWeakness () {
		return strength;
	}

	public String getStrength () {
		return weakness;
	}


}
