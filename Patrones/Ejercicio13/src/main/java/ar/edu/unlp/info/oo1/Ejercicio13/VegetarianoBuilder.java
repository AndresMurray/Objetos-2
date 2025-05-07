package ar.edu.unlp.info.oo1.Ejercicio13;

public class VegetarianoBuilder implements Builder{
	
	private Sandwich vegetariano;

	@Override
	public void setPrecioPan() {
		vegetariano.setPrecioPan(120);
		
	}

	@Override
	public void setPrecioAderezo() {
		vegetariano.setPrecioAderezo(0);
		
	}

	@Override
	public void setPrecioPrincipal() {
		vegetariano.setPrecioPrincipal(200);
		
	}

	@Override
	public void setPrecioAdicional() {
		vegetariano.setPrecioAdicional(100);
		
	}

	@Override
	public void reset() {
		this.vegetariano = new Sandwich();
		
	}

	@Override
	public Sandwich getSandwich() {
		return this.vegetariano;
	}
	
	

}
