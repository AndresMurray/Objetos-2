package ar.edu.unlp.info.oo1.ParcialPrimeraFecha24;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrestamoTest {
	
	private Banco banco;
	private Cliente cliente;
	private Prestamo p;
	
	
	@BeforeEach
	public void setUp() {
		
		this.cliente = new Cliente("Juan", 5000);
		this.banco = new Banco(1.05);
		this.p = this.banco.crearPrestamoSimple(100, 10, this.cliente);
		
	}
	
	@Test
	public void solicitarPrestamoTest() {
		assertTrue(p instanceof PrestamoSimple);
	}
	
	@Test
	public void estadoPrestamoTest() {
		assertTrue(p.getEstado() instanceof PrestamoAceptado);
	}
	
	

}
