package ar.edu.unlp.info.oo1.Ejercicio12;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends FileSystem {
	
	private int tamañoEnBytes;
	
	
	
	
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tamañoEnBytes) {
		super(nombre, fechaCreacion);
		this.tamañoEnBytes = tamañoEnBytes;
	}


	public int tamanoTotalOcupado() {
		return this.tamañoEnBytes;
	}


	@Override
	public Archivo archivoMasGrande() {
		return this;
	}


	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}


	@Override
	public FileSystem buscar(String nombre) {
		if(nombre.equals(this.nombre)) {
			return this;
		}
		else return null;
	}



	
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
	    if (this.nombre.equals(nombre)) {
	        return List.of(this); // solo uno
	    } else {
	        return List.of(); // lista vacía
	    }
	}
	
	

  public String listadoDeContenido(String pathHastaAhora) {
    return pathHastaAhora + "/" + this.nombre + "\n";
}


	

}
