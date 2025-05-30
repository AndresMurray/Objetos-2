package ar.edu.unlp.info.oo1.Ejercicio9;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDias;
	private LocalDate fecha;
	private AutoEnAlquiler auto;
	
	
	
	
	public Reserva(int cantidadDias, LocalDate fecha, AutoEnAlquiler auto) {
		super();
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
		this.auto = auto;
	}

	public double montoAPagar() {
		return auto.getPrecioPorDia()*this.cantidadDias;
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion) {
		
		return this.montoAPagar()*auto.calcularReembolso(this.fecha, fechaCancelacion);
		
	}


	
	

}
