package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLagarto {
	
	
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
		
		assertEquals("Gana Lagarto", lagarto.ejecutarJugada(papel).toString());
		assertEquals("Gana Piedra", lagarto.ejecutarJugada(piedra).toString());
		assertEquals("Gana Tijera", lagarto.ejecutarJugada(tijera).toString());
		assertEquals("Gana Lagarto", lagarto.ejecutarJugada(spock).toString());
		assertEquals("Empate", lagarto.ejecutarJugada(lagarto).toString());
		
	}

}
