package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUsuario {
	
	
	private Tweet unTweet;
	private Tweet dosTweet;
	private Usuario user;
	
	@BeforeEach
	public void setUp() {
		unTweet = new Tweet ("texto correcto");
		dosTweet = new Tweet ("El método assertEquals de JUnit se usa en pruebas unitarias para comparar un valor esperado con el obtenido. Si son diferentes, la prueba falla. Es útil para validar cálculos, salidas de métodos y lógica del código. Permite mejorar la calidad del software asegurando resultados correctos."); 
		user = new Usuario ("Lio");
	}
		
	
	@Test
	public void testLongitud() {
		assertTrue(user.cumpleLongitud(unTweet.getDescripcion()));
		assertFalse(user.cumpleLongitud(dosTweet.getDescripcion()));
		
	}
	
	@Test
	public void testBorrar() { //hay tweets y no hay son las particiones
		user.realizarPost("hola");
		assertEquals(1,user.getTweets().size());
		user.borrarTweets();
		assertEquals(0,user.getTweets().size());
		
	}
	
	@Test
	public void testRepost () {
		assertEquals(0, user.getTweets().size());
		user.reTwitear(unTweet);
		assertEquals(1, user.getTweets().size()	);

	}

}
