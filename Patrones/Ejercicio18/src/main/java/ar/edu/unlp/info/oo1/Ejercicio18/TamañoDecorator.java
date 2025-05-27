package ar.edu.unlp.info.oo1.Ejercicio18;

public class TamañoDecorator extends FileDecorator {
	
	
	
	public TamañoDecorator(FileComponent fileComponent) {
		super(fileComponent);
	}
	
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + "-" + this.getTamaño();
	}

}
