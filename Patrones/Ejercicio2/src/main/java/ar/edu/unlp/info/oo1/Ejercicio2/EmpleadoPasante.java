package ar.edu.unlp.info.oo1.Ejercicio2;

public class EmpleadoPasante extends Empleado {
	
	private int cantidadExamenes;
	
	private static final double sueldo = 20000;
	private static final double extraExamenes = 2000;
	
	protected double calcularSueldoBasico() {
		return sueldo;
		
	}
	
	protected double calcularAdicional() {
		
		return extraExamenes*cantidadExamenes;
	}

}
