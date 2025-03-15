package ejercicio2;

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
		
		assertEquals("Gana Papel", spock.ejecutarJugada(papel));
		assertEquals("Gana Spock", spock.ejecutarJugada(piedra));
		assertEquals("Gana Spock", spock.ejecutarJugada(tijera));
		assertEquals("Empate", spock.ejecutarJugada(spock));
		assertEquals("Gana Lagarto", spock.ejecutarJugada(lagarto));
		
	}

}
