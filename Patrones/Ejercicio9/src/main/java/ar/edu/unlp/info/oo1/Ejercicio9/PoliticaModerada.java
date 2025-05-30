package ar.edu.unlp.info.oo1.Ejercicio9;

import java.time.LocalDate;

public class PoliticaModerada extends PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion) {
		
		if(super.validarFecha(fechaReserva, fechaCancelacion)) {
			
			if(fechaCancelacion.plusDays(7).isBefore(fechaReserva)) {
				return 1;
			}
			else {
				if(fechaCancelacion.plusDays(2).isBefore(fechaReserva)) {
				return 0.50;
				}
			}
		}
		return 0;
			 
	}
	
	

}
