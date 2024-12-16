package site.jvdz.practice.pokemon.models.types;
import site.jvdz.practice.pokemon.interfaces.Pokemon;

public class FirePokemon extends Pokemon {
	private String strength;
	private String weakness;

    public FirePokemon (String name, int hp, int EvolutionStage, double weight, double height, String sound, String Strength, String weakness) {
		super(name, hp, EvolutionStage, weight, height, sound);
		this.strength = strength;
		this.weakness = weakness;
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

public void typeBonus() {
	System.out.println("Fire type bonus activated: Burn effect applied!");

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
