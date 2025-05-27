package ar.edu.unlp.info.oo1.Ejercicio18;
import java.time.*;

public class FileOO2 implements FileComponent{
	
	private String nombre;
	private String extension;
	private String tamaño;
	private LocalDate fechaDeCreacion;
	private LocalDate fechaDeModificacion;
	private String permisos;
	
	
	
	public FileOO2(String nombre, String extension, String tam, LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tam;
		this.fechaDeCreacion = fechaCreacion;
		this.fechaDeModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	
	public String prettyPrint() {
		return this.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getTamaño() {
		return tamaño;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public LocalDate getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public String getPermisos() {
		return permisos;
	}
	
	
	


	


	

}
