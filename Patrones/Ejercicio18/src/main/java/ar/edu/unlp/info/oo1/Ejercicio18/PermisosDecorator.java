package ar.edu.unlp.info.oo1.Ejercicio18;

public class PermisosDecorator extends FileDecorator {
	
	
	
	public PermisosDecorator(FileComponent fileComponent) {
		super(fileComponent);
	}
	
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + "-" +  this.getPermisos();
	}

}
