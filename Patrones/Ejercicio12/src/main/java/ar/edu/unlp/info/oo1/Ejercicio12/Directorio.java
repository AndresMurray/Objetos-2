package ar.edu.unlp.info.oo1.Ejercicio12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Directorio extends FileSystem {
	
	private List<FileSystem> contenido;
	
	
	

	public Directorio(String nombre, LocalDate fechaCreacion, List<FileSystem> contenido) {
		super(nombre, fechaCreacion);
		this.contenido = contenido;
	}

	@Override
	public int tamanoTotalOcupado() {
		
		return 32+this.contenido.stream()
			.mapToInt(c -> c.tamanoTotalOcupado()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream()
				.map(a -> a.archivoMasGrande())
				.max((a1,a2) -> Integer.compare(a1.tamanoTotalOcupado(),a2.tamanoTotalOcupado()))
				.orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
	    return this.contenido.stream()
	        .map(a -> a.archivoMasNuevo()) 
	        .max(Comparator.comparing(Archivo::getFecha)) 
	        .orElse(null); 
	}

	@Override
	public FileSystem buscar(String nombreBuscado) {
		if(nombreBuscado.equals(this.nombre))
			return this;
		else {
		    return this.contenido.stream()
		            .map(a -> a.buscar(nombreBuscado)) // llamada recursiva
		            .filter(fs -> fs != null)          // quedate solo con los que encontraron algo
		            .findFirst()
		            .orElse(null);                     // si no se encontró nada
			}
	}
	
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
	    List<FileSystem> resultados = new ArrayList<>();

	    if (this.nombre.equals(nombre)) {
	        resultados.add(this);
	    }
	    
	    this.contenido.stream()
	        .map(fs -> fs.buscarTodos(nombre)) // llamada recursiva que devuelve listas
	        .forEach(resultados::addAll);      // agregamos todas esas listas al resultado

	    return resultados;
	}
	
	public String listadoDeContenido(String pathHastaAhora) {
	    String pathActual = pathHastaAhora + "/" + this.nombre;

	    String hijos = this.contenido.stream()
	            .map(fs -> fs.listadoDeContenido(pathActual))
	            .collect(Collectors.joining());

	    return pathActual + "\n" + hijos;
	}

	
	
	
	
	
	
}


