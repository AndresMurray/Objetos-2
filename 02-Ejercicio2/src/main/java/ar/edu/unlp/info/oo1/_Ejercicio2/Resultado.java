package ar.edu.unlp.info.oo1._Ejercicio2;

import java.util.Optional;

public class Resultado {

	private Optional<Opcion> ganador; //devuelvo null o una instancia de opcion -> luego se podria mejorar usando el tiupo Optional<Opcion> de java
	
	// poner el toString para ver el ganardor
	
	public Resultado (Opcion ganador) {
		this.ganador= Optional.ofNullable(ganador);
	}
	
	
	@Override
	public String toString() {
	    return ganador.map(g -> "Gana " + g.getClass().getSimpleName())
	                  .orElse("Empate");
	}

	
}
