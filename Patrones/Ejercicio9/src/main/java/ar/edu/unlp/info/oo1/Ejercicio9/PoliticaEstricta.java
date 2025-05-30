package ar.edu.unlp.info.oo1.Ejercicio9;

import java.time.LocalDate;

public class PoliticaEstricta extends PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(LocalDate fechaReserva,LocalDate fechaCancelacion) {
		return 0;
	}
	
	

}
