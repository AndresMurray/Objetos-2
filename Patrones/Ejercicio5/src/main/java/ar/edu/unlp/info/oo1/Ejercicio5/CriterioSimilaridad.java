package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioSimilaridad extends Criterio {
	
	public List<Pelicula> sugerir(Decodificador decodificador) {
		
		List<Pelicula> reproducidas = decodificador.getReproducidas();
		List<Pelicula> similares = obtenerSimilaresSinDuplicados(reproducidas);
		//pq cuando obtengo la similares a las que reproduci puede haber alguna similar que tambien estaba en reproducida 
	    return this.peliculasOrdenadasPorFecha(this.filtrarReproducidas(reproducidas, similares)).stream()
	    		.limit(3).collect(Collectors.toList());
	}
	
	
	private List<Pelicula> obtenerSimilaresSinDuplicados(List<Pelicula> reproducidas){
	    return reproducidas.stream()
	            .flatMap(p -> p.getSimilares().stream())// que no haya sido reproducida
	            .distinct()
	            .collect(Collectors.toList());
	}	

}
