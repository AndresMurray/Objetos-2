package ar.edu.unlp.info.oo1.Ejercicio9;

import java.time.LocalDate;

public class PoliticaFlexible extends PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(LocalDate fechaReserva, LocalDate fechaCancelacion) {
		if(super.validarFecha(fechaReserva, fechaCancelacion))
			return 1;
		else 
			return 0;
	}
	

	

}
