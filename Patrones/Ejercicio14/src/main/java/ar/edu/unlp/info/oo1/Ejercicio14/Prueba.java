package ar.edu.unlp.info.oo1.Ejercicio14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Prueba {

	public static void main(String[] args) {
		// Escriba un ejemplo del código Java necesario para tomar como una prenda  combinada formada de un alquiler y un automóvil.

		Alquiler alq = new Alquiler(LocalDate.of(2020, 2, 5),LocalDate.of(2020, 4, 6), 10000);
		Automovil auto = new Automovil(LocalDate.of(2018, 1, 1),2000,200000);
		List<Prenda> componentes = new ArrayList();
		componentes.add(auto);
		componentes.add(alq);
		PrendaCombinada combinada = new PrendaCombinada(componentes);
		
		System.out.println(auto.calcularValorPrendario());
		System.out.println(alq.calcularValorPrendario());
		System.out.println(combinada.calcularValorPrendario());
		
		

	}

}
