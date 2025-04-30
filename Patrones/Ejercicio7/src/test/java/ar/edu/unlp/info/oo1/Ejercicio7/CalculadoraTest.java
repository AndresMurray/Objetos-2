package ar.edu.unlp.info.oo1.Ejercicio7;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	
	private Calculadora calculadora;
	
	@BeforeEach
	public void setUp() {
		
		calculadora = new Calculadora();
		
	}
	
	@Test
	public void testSumar() {
		
		calculadora.setValor(5);
		calculadora.mas();
		calculadora.setValor(8);
		assertEquals("Valor acumulado: 13.0",calculadora.getResultado());
		calculadora.borrar();
		assertEquals("Valor acumulado: 0.0",calculadora.getResultado());
	}
	
	@Test
	public void testMultiplicar() {
		
		calculadora.setValor(5);
		calculadora.por();
		calculadora.setValor(8);
		assertEquals("Valor acumulado: 40.0",calculadora.getResultado());
	}
	
	@Test
	public void testRestar() {
		
		calculadora.setValor(10);
		calculadora.menos();
		calculadora.setValor(8);
		assertEquals("Valor acumulado: 2.0",calculadora.getResultado());
		calculadora.borrar();
		assertEquals("Valor acumulado: 0.0",calculadora.getResultado());
	}
	
	@Test
	public void testError() {
		
		calculadora.setValor(10);
		calculadora.menos();
		calculadora.mas();
		assertEquals("Error",calculadora.getResultado());
		calculadora.borrar();
		assertEquals("Valor acumulado: 0.0",calculadora.getResultado());
	}
	
	@Test
	public void testDividir() {
		
		calculadora.setValor(6);
		calculadora.dividido();
		calculadora.setValor(3);
		assertEquals("Valor acumulado: 2.0",calculadora.getResultado());
		calculadora.dividido();
		calculadora.setValor(0);
		assertEquals("Error",calculadora.getResultado());
		calculadora.borrar();
		assertEquals("Valor acumulado: 0.0",calculadora.getResultado());
	}

}
