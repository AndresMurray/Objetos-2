package ejercicio2;

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
		
		assertEquals("Gana Papel", piedra.ejecutarJugada(papel));
		assertEquals("Empate", piedra.ejecutarJugada(piedra));
		assertEquals("Gana Piedra", piedra.ejecutarJugada(tijera));
		assertEquals("Gana Spock", piedra.ejecutarJugada(spock));
		assertEquals("Gana Piedra", piedra.ejecutarJugada(lagarto));
		
	}
	

}
