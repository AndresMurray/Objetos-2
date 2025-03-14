package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwitter {
	
	private Twitter tw;
	private Usuario uno ;
	private Usuario dos ;
	
	@BeforeEach
	public void SetUp() {
		tw = new Twitter ();
		uno = new Usuario ("Diego");
		
	}
	
	
	@Test
	public void testAgregarUsuario() {
		assertEquals(0,tw.getUsuarios().size());
		tw.agregarUsuario(uno);
		assertEquals(1,tw.getUsuarios().size());
	}
	
	@Test
	public void testEliminarUsuario() {
		tw.agregarUsuario(uno);
		assertEquals(1,tw.getUsuarios().size());
		tw.eliminarUsuario(uno);
		assertEquals(0,tw.getUsuarios().size());
	}
	
	@Test
	public void testExisteUsuario() {
		tw.agregarUsuario(uno);
		assertTrue(tw.existeUsuario(uno));
		assertFalse(tw.existeUsuario(dos));
		tw.eliminarUsuario(uno);
		assertEquals(0,tw.getUsuarios().size());
	}
	
	

}
