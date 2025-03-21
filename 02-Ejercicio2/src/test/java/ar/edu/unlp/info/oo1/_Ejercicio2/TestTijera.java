package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTijera {
	
	private Piedra piedra;
	private Papel papel;
	private Tijera tijera;
	private Spock spock;
	private Lagarto lagarto;
	
	
	@BeforeEach
	public void setUp () {
		
		piedra = new Piedra();
		papel = new Papel ();
		tijera = new Tijera ();
		spock = new Spock();
		lagarto = new Lagarto();
		
	}
	
	
	@Test
	public void testJugar() {
		
		assertEquals("Gana Tijera", tijera.ejecutarJugada(papel).toString());
		assertEquals("Gana Piedra", tijera.ejecutarJugada(piedra).toString());
		assertEquals("Empate",tijera.ejecutarJugada(tijera).toString());
		assertEquals("Gana Spock", tijera.ejecutarJugada(spock).toString());
		assertEquals("Gana Tijera", tijera.ejecutarJugada(lagarto).toString());
		
	}

}
