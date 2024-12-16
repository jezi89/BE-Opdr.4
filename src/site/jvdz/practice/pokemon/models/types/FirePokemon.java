package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Moves; 
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class FirePokemon extends Pokemon implements Moves{
	private final String strength;
	private final String weakness;

    public FirePokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound) {
		super(name, hp, EvolutionStage, weight, height, sound);
	    this.strength = "Grass";
	    this.weakness = "Water";
			}


@Override
public void attack() {
	System.out.println(getName() + " scorches the enemy with Flamethrower!");
}

@Override
public void defense() {
	System.out.println(getName() + " reduces incoming damage with Will-O-Wisp.");
}

@Override
public void special() {
	System.out.println(getName() + " engulfs the battlefield in a fiery Inferno!");
}

	@Override
	public void bonusMove() {
		System.out.println(getName() + " unleashes a blazing Flamethrower!");
	}

	public void typeBonus() {
		System.out.println("Fire type bonus activated! Burn damage increases!");
	}


	// Getters and Setters for strength and weakness
	public String getStrength() {
		return strength;
	}

	public String getWeakness() {
		return weakness;
	}

}
