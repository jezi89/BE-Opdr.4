package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves; 
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class PsychicPokemon extends Pokemon implements Moves {
	private final String strength;
	private final String weakness;

	public PsychicPokemon(String name, int hp, int EvolutionStage, double weight, double height, String sound) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = "Fighting, Other Psychic-types";
		this.weakness = "Psychic, (Soms geen duidelijk zwak type in oudere sets.)";
	}


	@Override
	public void attack() {
		System.out.println(getName() + " uses a Karate Chop");
	}

	@Override
	public void defense() {
		System.out.println(getName() + " shields teammates with a Mat Block.");
	}

	@Override
	public void special() {
		System.out.println(getName() + " unleashes a blazing special move!");
	}

	@Override
	public void bonusMove() {
		System.out.println(getName() + " unleashes a mind-bending Psychic Blast!");
	}

	public void typeBonus() {
		System.out.println("Psychic type bonus activated! Special attack power increases!");
	}

	// Getters and Setters for strength and weakness
	public String getStrength() {
		return strength;
	}

	

	public String getWeakness() {
		return weakness;
	}


}