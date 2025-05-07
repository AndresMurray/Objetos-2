package ar.edu.unlp.info.oo1.Ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	
	private Topografia agua;
	private Topografia tierra;
	private Topografia aguaDos;
	private Topografia tierraDos;
	private Topografia mixta;
	private Topografia mixtaDos;
	private Topografia mixtaTres;
	private Topografia pantano;
	private Topografia pantanoDos;
	
	
	@BeforeEach
	public void setUp() {
		
		agua = new Agua();
		tierra = new Tierra();
		aguaDos = new Agua();
		tierraDos = new Tierra();
		mixta= new Mixta(agua,tierra,aguaDos,tierraDos);
		mixtaDos= new Mixta(agua,tierra,aguaDos,tierraDos);
		mixtaTres = new Mixta (agua, agua, tierra,tierra);
		pantano = new Pantano();
		pantanoDos = new Pantano();
		
		
	}
	
	
	@Test
	public void proporcionAguaTest() {
		
		assertEquals(1, agua.getProporcionAgua());
		assertEquals(0, agua.getProporcionTierra());
		assertEquals(0, tierra.getProporcionAgua());
		assertEquals(1, tierra.getProporcionTierra());
		assertEquals(0.5, mixta.getProporcionAgua());
		assertEquals(0.5, mixta.getProporcionTierra());
		
		//pantano
		assertEquals(0.7, pantano.getProporcionAgua());
		assertEquals(0.30000000000000004, pantano.getProporcionTierra());
		
		
	}
	
	@Test 
	
	public void sonIgualesTest() {
		assertTrue(agua.sonIguales(aguaDos));
		assertFalse(agua.sonIguales(tierra));
		assertTrue(mixta.sonIguales(mixtaDos));
		assertFalse(mixta.sonIguales(mixtaTres));
		
		
		assertTrue(pantano.sonIguales(pantanoDos));
	}
	

}
