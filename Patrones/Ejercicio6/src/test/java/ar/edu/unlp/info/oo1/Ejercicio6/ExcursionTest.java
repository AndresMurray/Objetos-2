package ar.edu.unlp.info.oo1.Ejercicio6;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	
	private Excursion excursion;
	private Usuario uno;
	private Usuario dos;
	private Usuario tres;
	
	@BeforeEach
	void setUp() {
		excursion = new Excursion("Dos días en kayak bajando el Paraná",1,2, LocalDate.now(),LocalDate.of(2025, 4, 30), "Centro", 1000);
		uno = new Usuario("Juli", "x", "juli@gmail.com");
		dos = new Usuario("Clara", "R", "clara@gmail.com");
		tres = new Usuario("Diego", "R", "diego@gmail.com");
		
		excursion.inscribir(uno);
		excursion.inscribir(dos);
				
	}
	
	@Test
	public void inscribirUsuarioTest() {
		
		excursion.inscribir(tres);
		assertEquals(2, excursion.getCantidadInscriptos()); // no debería aumentar
		assertTrue(excursion.getListaEspera().contains(tres)); // Diego quedó en espera
		assertTrue(excursion.getEstado() instanceof InscripcionCompleta);
		
		
	}
	

}
