package ejercicio2;

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
		
		assertEquals("Gana Tijera", tijera.ejecutarJugada(papel));
		assertEquals("Gana Piedra", tijera.ejecutarJugada(piedra));
		assertEquals("Empate",tijera.ejecutarJugada(tijera));
		assertEquals("Gana Spock", tijera.ejecutarJugada(spock));
		assertEquals("Gana Tijera", tijera.ejecutarJugada(lagarto));
		
	}

}
