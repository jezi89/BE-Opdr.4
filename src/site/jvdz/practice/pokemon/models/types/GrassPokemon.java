package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves; 
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class GrassPokemon extends Pokemon implements Moves {
	private final String strength;
	private final String weakness;

	public GrassPokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = "Water, Fighting";
		this.weakness = "Fire";
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

	@Override
	public void bonusMove() {
		System.out.println(getName() + " uses a powerful Solar Beam!");
	}

	public void typeBonus() {
		System.out.println("Grass type bonus activated: Healing over time!");
	}

	// Getters and Setters for strength and weakness
	public String getStrength() {
		return strength;
	}

	public String getWeakness() {
		return weakness;
	}


}
