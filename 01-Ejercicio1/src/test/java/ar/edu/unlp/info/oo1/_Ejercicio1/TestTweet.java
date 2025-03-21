package ar.edu.unlp.info.oo1._Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTweet {
	
	
	private Usuario user;
	private Usuario userDos;
	
	@BeforeEach
	public void setUp() {
		user = new Usuario ("Lio");
		userDos = new Usuario ("Julian");
	}
	
	
	
	@Test
	public void testLongitud() {
		assertDoesNotThrow(() -> new Tweet("Este es un tweet válido", user));
		 assertThrows(IllegalArgumentException.class, () -> {
			 new Tweet ("El método assertEquals de JUnit se usa en pruebas unitarias para comparar un valor esperado con el obtenido. Si son diferentes, la prueba falla. Es útil para validar cálculos, salidas de métodos y lógica del código. Permite mejorar la calidad del software asegurando resultados correctos.", userDos); 
	        });
	}

}
