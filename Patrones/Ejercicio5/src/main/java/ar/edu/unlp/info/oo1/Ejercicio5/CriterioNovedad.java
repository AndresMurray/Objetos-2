package ar.edu.unlp.info.oo1.Ejercicio5;
import java.util.*;
import java.util.stream.Collectors;

public class CriterioNovedad extends Criterio {
	
	public List<Pelicula> sugerir(Decodificador decodificador){
		
		List<Pelicula> reproducidas = decodificador.getReproducidas(); 
		List<Pelicula> grillaPeliculas = decodificador.getGrillaDePeliculas();
		
		return this.peliculasOrdenadasPorFecha(this.filtrarReproducidas(reproducidas,grillaPeliculas)) 
				.stream().limit(3).collect(Collectors.toList());
	}
	
	

	

}
