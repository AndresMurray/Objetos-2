package ar.edu.unlp.info.oo1.Ejercicio12;

import java.time.LocalDate;
import java.util.List;


public abstract class FileSystem{

	protected String nombre;
	protected LocalDate fechaCreacion;
	
	
	
	public FileSystem(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}

	public abstract int tamanoTotalOcupado();
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
	
	public abstract FileSystem buscar(String nombre);
	
	public abstract List<FileSystem> buscarTodos(String nombre);
	
	
	public String listadoDeContenido() {
	    return this.listadoDeContenido("");
	}

	public abstract String listadoDeContenido(String pathHastaAhora);
	
	
	
	
	public LocalDate getFecha() {
		return this.fechaCreacion;
	}

}
