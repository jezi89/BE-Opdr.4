package site.jvdz.practice.pokemon.app;

import site.jvdz.practice.pokemon.models.types.*;

public class Main {
    public static void main(String[] args) {
        // Pokémon Types instantiëren
        FirePokemon p1 = new FirePokemon("Charmander", 39, 1, 8.5, 0.6, "Char!");
        WaterPokemon p2 = new WaterPokemon("Squirtle", 44, 1, 9.0, 0.5, "Squirt!");
        GrassPokemon p3 = new GrassPokemon("Bulbasaur", 45, 1, 6.9, 0.7, "Bulba!");
        LightningPokemon p4 = new LightningPokemon("Pikachu", 35, 1, 6.0, 0.4, "Pika!");
        // Methodes uitvoeren
        System.out.println(p1.getName() + " is a Fire type Pokémon." + " It has " + p1.getHp() + " HP." + "and is in its " + p1.getEvolutionStage() + "st evolution stage." + " It weighs " + p1.getWeight() + " kg." + " and is " + p1.getHeight() + " m tall." + " It says " + p1.getSound());
        System.out.println(p1.getName() + " is strong against: " + p1.getStrength());
        System.out.println(p1.getName() + " is weak against: " + p1.getWeakness());
        System.out.println(p2.getName() + " is a Water type Pokémon." + " It has " + p2.getHp() + " HP." + "and is in its " + p2.getEvolutionStage() + "st evolution stage." + " It weighs " + p2.getWeight() + " kg." + " and is " + p2.getHeight() + " m tall." + " It says " + p2.getSound());
        System.out.println(p2.getName() + " is strong against: " + p2.getStrength());
        System.out.println(p2.getName() + " is weak against: " + p2.getWeakness());
        System.out.println(p3.getName() + " is a Grass type Pokémon." + " It has " + p3.getHp() + " HP." + "and is in its " + p3.getEvolutionStage() + "st evolution stage." + " It weighs " + p3.getWeight() + " kg." + " and is " + p3.getHeight() + " m tall." + " It says " + p3.getSound());
        System.out.println(p3.getName() + " is strong against: " + p3.getStrength());
        System.out.println(p3.getName() + " is weak against: " + p3.getWeakness());
        System.out.println(p4.getName() + " is a Lightning type Pokémon." + " It has " + p4.getHp() + " HP." + "and is in its " + p4.getEvolutionStage() + "st evolution stage." + " It weighs " + p4.getWeight() + " kg." + " and is " + p4.getHeight() + " m tall." + " It says " + p4.getSound());
        System.out.println(p4.getName() + " is strong against: " + p4.getStrength());
        System.out.println(p4.getName() + " is weak against: " + p4.getWeakness());
    }

    }



/*


        // Output tonen
        System.out.println(fireType.getTypeName() + " is strong against: " + fireType.getStrength());
        System.out.println(waterType.getTypeName() + " is weak against: " + waterType.getWeakness());


public class Main {
    public static void main(String[] args) {
        PokemonTypeModel gen1Model = new Gen1Models();
        PokemonTypeModel opdrachtModel = new OpdrachtModels();

    printPokemonTypes("Gen1 Types", gen1Model.getPokemonTypes());
    printPokemonTypes("Opdracht Types", opdrachtModel.getPokemonTypes());
}


private static void printPokemonTypes(String title, List<Class<?>> types) {
    System.out.println(title + ":");
    for (Class<?> type : types) {
        System.out.println(" - " + type.getSimpleName());
    }
}
}
*/
