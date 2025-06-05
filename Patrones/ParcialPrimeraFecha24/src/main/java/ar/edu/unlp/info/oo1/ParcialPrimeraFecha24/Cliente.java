package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

public class Cliente {
	
	private String nombre;
	private double salarioReal;
	
	
	
	public Cliente(String nombre, double salarioReal) {
		super();
		this.nombre = nombre;
		this.salarioReal = salarioReal;
	}


	public double getSalario() {
		return this.salarioReal;
	}
	

}
