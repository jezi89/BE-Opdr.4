package site.jvdz.practice.pokemon.base;
import java.util.List;

public interface CombinedTypes {
	List<String> getTypes(); // Geeft een lijst van typen terug

	default boolean hasMultipleTypes() {
		return getTypes().size() > 1;
	}
}
