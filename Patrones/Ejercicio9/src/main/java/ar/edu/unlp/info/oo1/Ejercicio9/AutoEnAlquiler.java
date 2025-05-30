package ar.edu.unlp.info.oo1.Ejercicio9;

import java.time.LocalDate;

public class AutoEnAlquiler {
	
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaDeCancelacion politicaCancelacion;
	
	
	
	
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
		super();
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
		
	}


	public void setPoliticaCancelacion(PoliticaDeCancelacion unaPolitica) {
		
		this.politicaCancelacion = unaPolitica;
	}


	public double calcularReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion) {
		return this.politicaCancelacion.calcularReembolso(fechaReserva, fechaCancelacion);
	}


	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
	
	
	
	

}
