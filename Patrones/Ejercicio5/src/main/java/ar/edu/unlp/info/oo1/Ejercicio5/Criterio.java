package ar.edu.unlp.info.oo1.Ejercicio5;
import java.util.*;
import java.util.stream.Collectors;

public abstract class Criterio {
	
	
	public abstract List<Pelicula> sugerir(Decodificador decodificador);
	
	public List<Pelicula> filtrarReproducidas(List<Pelicula>reproducidas, List<Pelicula>peliculasAFiltrar){
		return peliculasAFiltrar.stream()
				.filter(p -> !reproducidas.contains(p))
				.collect(Collectors.toList());
	}
	
	public List<Pelicula> peliculasOrdenadasPorFecha(List<Pelicula> peliculas){
		return peliculas.stream()
			   .sorted((p1,p2) -> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
			   .collect(Collectors.toList());
	}
	
	

}
