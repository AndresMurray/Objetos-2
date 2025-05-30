package ar.edu.unlp.info.oo1.Ejercicio9;

import java.time.LocalDate;

public abstract class PoliticaDeCancelacion {
	
	public abstract double calcularReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion);
	
	
	public boolean validarFecha(LocalDate fechaReserva, LocalDate fechaCancelacion) {
		return fechaCancelacion.isBefore(fechaReserva);
	}
	

}
