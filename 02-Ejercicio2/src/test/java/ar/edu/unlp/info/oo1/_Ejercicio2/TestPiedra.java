package ar.edu.unlp.info.oo1._Ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPiedra {
	
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
		
		assertEquals("Gana Papel", piedra.ejecutarJugada(papel).toString());
		assertEquals("Empate", piedra.ejecutarJugada(piedra).toString());
		assertEquals("Gana Piedra", piedra.ejecutarJugada(tijera).toString());
		assertEquals("Gana Spock", piedra.ejecutarJugada(spock).toString());
		assertEquals("Gana Piedra", piedra.ejecutarJugada(lagarto).toString());
		
	}
	

}
