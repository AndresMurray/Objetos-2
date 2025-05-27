package ar.edu.unlp.info.oo1.Ejercicio18;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent {
	
	private FileComponent fileComponent;
	
	public FileDecorator (FileComponent fileComponent) {
		this.fileComponent = fileComponent;
	}
	
	
	public String prettyPrint() {
		return fileComponent.prettyPrint();
	}
	
	public String getNombre() {
		return fileComponent.getNombre();
	}

	public String getExtension() {
		return fileComponent.getExtension();
	}

	public String getTamaño() {
		return fileComponent.getTamaño();
	}

	public LocalDate getFechaDeCreacion() {
		return fileComponent.getFechaDeCreacion();
	}

	public LocalDate getFechaDeModificacion() {
		return fileComponent.getFechaDeModificacion();
	}

	public String getPermisos() {
		return fileComponent.getPermisos();
	}
	
	public FileComponent getFileComponent () {
		return this.fileComponent;
	}
	
	

}
