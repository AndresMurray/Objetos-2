package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPapel {
	

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
		
		assertEquals("Empate", papel.ejecutarJugada(papel));
		assertEquals("Gana Papel", papel.ejecutarJugada(piedra));
		assertEquals("Gana Tijera", papel.ejecutarJugada(tijera));
		assertEquals("Gana Papel", papel.ejecutarJugada(spock));
		assertEquals("Gana Lagarto", papel.ejecutarJugada(lagarto));
		
	}

}
