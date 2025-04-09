package ar.edu.unlp.info.oo1.Ejercicio2;

public class EmpleadoTemporario extends Empleado{
	

	private int cantidadHorasTrabajadas;
	
	private static final double sueldo = 20000;
	private static final double extraHorasTrabajadas = 300;
	
	protected double calcularSueldoBasico() {
		return sueldo+(this.cantidadHorasTrabajadas*extraHorasTrabajadas);
		
	}
	
	protected double calcularAdicional() {
		return this.adicionalPorFamilia();
	}
	

}
