package site.jvdz.practice.pokemon;

import site.jvdz.practice.pokemon.models.*;

import java.util.List;

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