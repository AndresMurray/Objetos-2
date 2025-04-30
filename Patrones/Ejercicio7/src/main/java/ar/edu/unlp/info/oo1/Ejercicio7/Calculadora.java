package ar.edu.unlp.info.oo1.Ejercicio7;

public class Calculadora {
	
	private double valorAcumulado;
	private EstadoCalculadora estado;
	
	public Calculadora() {
		this.estado = new EstadoInicio();
	}
	
	public String getResultado () {
		return estado.resultado(this);
	}
	
	
	public void setValor(double unValor) {
		
		this.estado.setValor(this,unValor);
		
	}
	
	public void mas() {
		this.estado.mas(this);
	}
	
	public void menos() {
		this.estado.menos(this);
	}
	
	
	public void por() {
		this.estado.por(this);
	}
	
	
	public void dividido() {
		this.estado.dividido(this);
	}
	
	public double getValorAcumulado() {
		return this.valorAcumulado;
	}
	
	public void borrar() {
		this.valorAcumulado=0;
		this.estado = new EstadoInicio();
	}
	
	
	public void setResultado(double resultado) {
		this.valorAcumulado= resultado;
	}
	
	public void setEstado(EstadoCalculadora estado) {
		this.estado= estado;
	}
	
	

}
