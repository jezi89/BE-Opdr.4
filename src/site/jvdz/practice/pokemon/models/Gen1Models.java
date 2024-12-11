package site.jvdz.practice.pokemon.models;

import site.jvdz.practice.pokemon.gen1.types.*;

import java.util.Arrays;
import java.util.List;

public class Gen1Models implements PokemonTypeModel {
	@Override
	public list<Class<?>> getPokemonTypes() {
		return Array.asList(
				Bug.class,
				Dragon.class,
				Electric.class,
				Fighting.class,
				Fire.class,
				Flying.class,
				Ghost.class,
				Grass.class,
				Ground.class,
				Ice.class,
				Normal.class,
				Poison.class,
				Psychic.class,
				Rock.class,
				Water.class
		);
	}
}
