package ar.edu.unlp.info.oo1.Ejercicio2;

public class EmpleadoDePlanta extends Empleado{
	

	private int antiguedad;
	

	private static final double extraAntiguedad = 2000;
	private static final double sueldo = 50000;
	
	protected double calcularSueldoBasico() {
		return sueldo;
		
	}
	
	protected double calcularAdicional() {
		return this.adicionalPorFamilia()+(extraAntiguedad*this.antiguedad);
	}
	
	

}
