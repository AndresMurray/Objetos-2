package ar.edu.unlp.info.oo1._Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwitter {
	
	private Twitter tw;
	private Usuario uno ;
	
	
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
	
	

	

}
