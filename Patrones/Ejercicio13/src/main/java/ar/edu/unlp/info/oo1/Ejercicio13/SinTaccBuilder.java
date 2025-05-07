package ar.edu.unlp.info.oo1.Ejercicio13;

public class SinTaccBuilder implements Builder {
	
	private Sandwich sinTacc;
	
	public SinTaccBuilder() {
		this.reset();
	}
	
	public void reset() {
		this.sinTacc = new Sandwich();
	}

	@Override
	public void setPrecioPan() {
		sinTacc.setPrecioPan(150);
		
	}

	@Override
	public void setPrecioAderezo() {
		sinTacc.setPrecioAderezo(18);
		
	}

	@Override
	public void setPrecioPrincipal() {
		sinTacc.setPrecioPrincipal(250);
		
	}

	@Override
	public void setPrecioAdicional() {
		
		sinTacc.setPrecioAdicional(200);
	}
	
	public Sandwich getSandwich() {
		return sinTacc;
		
	}
	
	
	


}
