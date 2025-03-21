package ar.edu.unlp.info.oo1._Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestUsuario {
	
	

	private Usuario user;
	private Usuario userDos;
	
	@BeforeEach
	public void setUp() {
		user = new Usuario ("Lio");
		userDos = new Usuario ("Julian");
	}
		
	
	
	
	
	
	@Test
	public void testBorrar() { //Dos casos:tengo que eliminar, no tengo que eliminar. depende si era refe de otro User o no
		
		Tweet t = userDos.realizarPost("Una descripcion");
		user.reTwitear(t);
		user.realizarPost("otro tweet");
		assertEquals(2,user.getTweets().size());
		user.eliminarTweetsDe(userDos);
		assertEquals(1,user.getTweets().size());
		
	}
	


}
