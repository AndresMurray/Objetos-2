package ar.edu.unlp.info.oo1.Ejercicio18;

public class ExtensionDecorator extends FileDecorator {
	
	
	
	
	public ExtensionDecorator(FileComponent fileComponent) {
		super(fileComponent);
	}
	
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + "-" + this.getExtension();
	}

}
