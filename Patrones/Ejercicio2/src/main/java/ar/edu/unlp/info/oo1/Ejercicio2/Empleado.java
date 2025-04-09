package ar.edu.unlp.info.oo1.Ejercicio2;

public abstract class Empleado {
	
	
	protected boolean casado;
	protected int cantidadHijos;
	
	private static final double extraCasado = 5000;
	private static final double extraHijo = 2000;
	
	public double sueldo() {
		return this.calcularSueldoBasico()+this.calcularAdicional()-this.calcularDescuento();
	}
	
	private double calcularDescuento() {
		return (this.calcularSueldoBasico()*0.13)+(this.calcularAdicional()*0.5);
	}
	
	protected double adicionalPorFamilia() {
	    double total = 0;
	    if (casado) total += extraCasado;
	    total += extraHijo* cantidadHijos;
	    return total;
	}

	
	protected  abstract double calcularSueldoBasico();
	protected  abstract double calcularAdicional();
	
	

}
