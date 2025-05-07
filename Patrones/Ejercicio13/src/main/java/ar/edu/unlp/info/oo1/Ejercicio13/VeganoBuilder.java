package ar.edu.unlp.info.oo1.Ejercicio13;

public class VeganoBuilder implements Builder{
	
	private Sandwich vegano;
	
	
	public VeganoBuilder() {
		this.reset();
	}

	@Override
	public void setPrecioPan() {
		vegano.setPrecioPan(100);
		
	}

	@Override
	public void setPrecioAderezo() {
		vegano.setPrecioAderezo(20);
		
	}

	@Override
	public void setPrecioPrincipal() {
		vegano.setPrecioPrincipal(500);
		
	}

	@Override
	public void setPrecioAdicional() {
		vegano.setPrecioAdicional(0);
		
	}

	@Override
	public void reset() {
		this.vegano = new Sandwich();
		
	}

	@Override
	public Sandwich getSandwich() {
		return this.vegano;
	}

}
