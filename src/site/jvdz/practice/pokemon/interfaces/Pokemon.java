package site.jvdz.practice.pokemon.interfaces;

public abstract class Pokemon  {
    private String name;
    private int hp; // Hitpoints is Maximum Healthpoints
    private int evolutionStage; // 1 = Charmander, 2 = Charmeleon, 3 = Charizardprivate double height:
    private double weight;
    private double height;
    private String sound;

    public Pokemon(String name, int hp, int evolutionStage, double weight, double height, String sound) {
        this.name = name;
        this.hp = hp;
        this.evolutionStage = evolutionStage;
        this.height = height;
        this.weight = weight;
        this.sound = sound;
    }
    public abstract void attack(); // Methode die subklassen moeten implementeren
    public abstract void defense();
    public abstract void special();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEvolutionStage() {
        return evolutionStage;
    }

    public void setEvolutionStage(int evolutionStage) {
        this.evolutionStage = evolutionStage;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // Common method
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }


}

/*
public abstract void hasTypename();

public void setEvolutionStage(int evolutionStage) {
    this.evolutionStage = evolutionStage;
}

public void evolutionStageUp() {
    this.evolutionStage++;
    System.out.println(name + " Evolved " + evolutionStage + "!");
}


Pokemon hebben zowel Abilities als attacks

HitHp naar 0 betekent dropped out
Attack kost bepaalde energie. .Dit kan ook random energie zijn.
        Energie kan worden aangevuld

        Pokemon hebben ook bepaalde weaknesses waar een multiplier op kan zitten

        Een Pokemon verslaan evert prijskaarten op

        Er zijn oko Trainer Cards zoals "ultra ball"

Pokemons kunnen ook retreaten*//*


//private int level;


//    private String raritySymbol;
//    // common = black circle, uncommon = = black diamond, rare =  = black star. Bonus...
//    // Holographic/Holofoil rare = black star + shiny; Reverse holographic/holofoil rare = black star + shiny card.
//    // Bonus bonus: Different types of ultra rare cards:



*/
