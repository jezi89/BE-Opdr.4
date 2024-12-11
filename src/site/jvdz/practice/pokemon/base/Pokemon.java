package site.jvdz.practice.pokemon.base;

public abstract class Pokemon {
    private String name;
//    final boolean Gen1Model;
    //    15 verschillende types: Bug, Dragon, Electric, Fighting, Fire, Flying, Ghost, Grass, Ground, Ice, Normal, Poison, Psychic, Rock, and Water
    private int hp;
    private int level;
//    private String attack;
//    private String defense;
//    private String special;
//    private int speed;
//    private int evolutionStage; // 1 = Charmander, 2 = Charmeleon, 3 = Charizard
//    private String raritySymbol;
//    // common = black circle, uncommon = = black diamond, rare =  = black star. Bonus...
//    // Holographic/Holofoil rare = black star + shiny; Reverse holographic/holofoil rare = black star + shiny card.
//    // Bonus bonus: Different types of ultra rare cards:



    public Pokemon(String name, int healthPoints, int level) {
        this.name = name;
        this.hp = healthPoints;
        this.level = level;

    }


public void setName(String name) {
    this.name = name;
}

public int getLevel() {
    return level;
}

public void setLevel(int level) {
    this.level = level;
}

public int getHp() {
    return hp;
}

public void setHp(int healthPoints) {
    this.hp = healthPoints;
}

public abstract void attack(); // Methode die subklassen moeten implementeren

public void levelUp() {
    this.level++;
    System.out.println(name + " leveled up to " + level + "!");
}
}

/*

Pokemon hebben zowel Abilities als attacks

HP naar 0 betekent dropped out
Attack kost bepaalde energie. .Dit kan ook random energie zijn.
        Energuie kan worden aangevuld

        Pokemon hebben ook bepaalde weaknesses waar een multiplier op kan zitten

        Een Pokemon veslaan evert prijskaarten op

        Er zijn oko Trainer Cards zoals "ultra ball"

Pokemons kunnen ok retreaten*/
