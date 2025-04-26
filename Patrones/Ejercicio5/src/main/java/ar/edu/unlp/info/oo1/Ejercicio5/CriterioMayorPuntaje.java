package ar.edu.unlp.info.oo1.Ejercicio5;
import java.util.List;
import java.util.stream.Collectors;

public class CriterioMayorPuntaje extends Criterio{

	public List<Pelicula> sugerir(Decodificador decodificador){
		
		List<Pelicula> filtradas = this.filtrarReproducidas(decodificador.getReproducidas(),decodificador.getGrillaDePeliculas());
		return this.peliculasOrdenadasPorFecha(filtradas).stream()
			.sorted((p1,p2) ->
					 Double.compare(p2.getPuntaje(),p1.getPuntaje()))	
			.collect(Collectors.toList());
				
	}
	
	
	

	
	

}
