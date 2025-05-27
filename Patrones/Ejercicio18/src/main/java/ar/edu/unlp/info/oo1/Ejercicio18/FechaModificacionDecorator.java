package ar.edu.unlp.info.oo1.Ejercicio18;

public class FechaModificacionDecorator extends FileDecorator {
	
	
	
	public FechaModificacionDecorator(FileComponent fileComponent) {
		super(fileComponent);
	}
	
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + "-" + this.getFechaDeModificacion();
	}

}
