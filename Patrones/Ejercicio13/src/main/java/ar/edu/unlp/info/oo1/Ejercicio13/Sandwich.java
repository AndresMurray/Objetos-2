package ar.edu.unlp.info.oo1.Ejercicio13;

public class Sandwich {
	
	private double precioPan;
	private double precioAderezo;
	private double precioPrincipal;
	private double precioAdicional;

	public void setPrecioPan(double precioPan) {
		this.precioPan = precioPan;
	}
	public void setPrecioAderezo(double precioAderezo) {
		this.precioAderezo = precioAderezo;
	}
	public void setPrecioPrincipal(double precioPrincipal) {
		this.precioPrincipal = precioPrincipal;
	}
	public void setPrecioAdicional(double precioAdicional) {
		this.precioAdicional = precioAdicional;
	}
	
	public double getPrecio() {
		return this.precioAderezo+this.precioAdicional+this.precioPrincipal+this.precioPan;
	}
	
	
	
	
	
	
	

}
