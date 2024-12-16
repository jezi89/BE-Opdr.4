import site.jvdz.practice.pokemon.models.types.Fire;
import site.jvdz.practice.pokemon.models.types.WaterPokemon;
import site.jvdz.practice.pokemon.interfaces.PokemonTypes;


public class Main {
    public static void main(String[] args) {
        // Pokémon Types instantieren
        PokemonTypes fireType = new Fire();
        PokemonTypes waterType = new WaterPokemon();

        // Output tonen
        System.out.println(fireType.getTypeName() + " is strong against: " + fireType.getStrength());
        System.out.println(waterType.getTypeName() + " is weak against: " + waterType.getWeakness());
    }
}


/*
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
