package ar.edu.unlp.info.oo1.Ejercicio13;

public class Director {
	
	private Builder builder;
	
	public Director (Builder builder) {
		this.builder= builder;
	}
	
	public void prepararSandwich() {
		
		builder.reset();
		builder.setPrecioPan();
		builder.setPrecioAderezo();
		builder.setPrecioPrincipal();
		builder.setPrecioAdicional();
		
	}
	
	public void cambiarSandwich(Builder builder) {
		this.builder= builder;
	}

	
}
