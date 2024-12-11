package site.jvdz.practice.pokemon.models;

import site.jvdz.practice.pokemon.gen1.types.*;

import java.util.Arrays;
import java.util.List;

public class OpdrachtModels implements PokemonTypeModel {
	@Override
	public list<Class<?>> getPokemonTypes() {
		return Array.asList(

		Fire.class,
				Fire.class,
				Water.class,
				Grass.class,
				Electric.class
				);
	}
}
