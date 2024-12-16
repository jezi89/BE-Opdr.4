package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves; 
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class LightningPokemon extends Pokemon implements Moves {
	private final String strength;
	private final String weakness;

	public LightningPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = "Water";
		this.weakness = "Fighting";
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

	@Override
	public void bonusMove() {
		System.out.println(getName() + " strikes with a thunderous Thunderbolt!");
	}

	public void typeBonus() {
		System.out.println("Lightning type bonus activated! Speed and critical hit rate increased!");
	}
	// Getters and Setters for strength and weakness
	public String getStrength() {
		return strength;
	}


	public String getWeakness() {
		return weakness;
	}


}
