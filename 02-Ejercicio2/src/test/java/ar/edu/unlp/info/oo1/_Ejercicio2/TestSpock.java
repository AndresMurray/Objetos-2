package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSpock {
	

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
		
		assertEquals("Gana Papel", spock.ejecutarJugada(papel).toString());
		assertEquals("Gana Spock", spock.ejecutarJugada(piedra).toString());
		assertEquals("Gana Spock", spock.ejecutarJugada(tijera).toString());
		assertEquals("Empate", spock.ejecutarJugada(spock).toString());
		assertEquals("Gana Lagarto", spock.ejecutarJugada(lagarto).toString());
		
	}

}
