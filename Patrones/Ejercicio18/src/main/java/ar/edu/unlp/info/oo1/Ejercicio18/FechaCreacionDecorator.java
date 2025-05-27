package ar.edu.unlp.info.oo1.Ejercicio18;
import java.time.*;

public class FechaCreacionDecorator extends FileDecorator{
	
	
	
	public FechaCreacionDecorator(FileComponent fileComponent) {
		super(fileComponent);
	}
	
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + "-" + this.getFechaDeCreacion();
	}

}
