package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class LightningPokemon extends Pokemon {
	private String strength;
	private String weakness;

	public LightningPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound, String Strength, String weakness) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = strength;
		this.weakness = weakness;
	}


	@Override
	public void attack() {
		System.out.println(getName() + " shocks the opponent with Thunderbolt!");
	}

	@Override
	public void defense() {
		System.out.println(getName() + " creates an electric barrier with Charge.");
	}

	@Override
	public void special() {
		System.out.println(getName() + " unleashes a blinding Thunderstorm!");
	}

	public void typeBonus() {
		System.out.println("Lightning type bonus activated: Increased speed!");
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
