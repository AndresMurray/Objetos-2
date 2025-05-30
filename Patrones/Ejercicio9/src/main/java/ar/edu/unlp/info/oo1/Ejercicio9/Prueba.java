package ar.edu.unlp.info.oo1.Ejercicio9;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		
		
		AutoEnAlquiler a = new AutoEnAlquiler(1000,2,"BMW");
		Reserva r = new Reserva(4, 	LocalDate.of(2025,3 , 8), a);
		a.setPoliticaCancelacion(new PoliticaFlexible());
		System.out.println(r.montoAReembolsar(LocalDate.of(2025, 3, 1)));;
		a.setPoliticaCancelacion(new PoliticaEstricta());
		System.out.println();;
		System.out.println(r.montoAReembolsar(LocalDate.of(2025, 3, 1)));;//estricta
		a.setPoliticaCancelacion(new PoliticaModerada());
		System.out.println(r.montoAReembolsar(LocalDate.of(2025, 3,3 )));;
		
	}

}
