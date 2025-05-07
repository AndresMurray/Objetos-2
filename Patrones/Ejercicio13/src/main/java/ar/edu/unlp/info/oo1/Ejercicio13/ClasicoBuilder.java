package ar.edu.unlp.info.oo1.Ejercicio13;

public class ClasicoBuilder implements Builder{
	
	private Sandwich clasico;
	
	public ClasicoBuilder() {
		this.reset();
	}
	
	@Override
	public void reset() {
		this.clasico = new Sandwich();
		
	}
	
	

	@Override
	public void setPrecioPan() {
		clasico.setPrecioPan(100);
		
	}

	@Override
	public void setPrecioAderezo() {
		clasico.setPrecioAderezo(20);
		
	}

	@Override
	public void setPrecioPrincipal() {
		clasico.setPrecioPrincipal(300);
		
	}

	@Override
	public void setPrecioAdicional() {
		
		clasico.setPrecioAdicional(80);
	}
	
	public Sandwich getSandwich() {
		return clasico;
		
	}



}
