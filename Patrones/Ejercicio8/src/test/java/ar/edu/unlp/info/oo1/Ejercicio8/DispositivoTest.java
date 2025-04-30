package ar.edu.unlp.info.oo1.Ejercicio8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DispositivoTest {
	
	
	private Dispositivo dispositivo;

	
	
	
	@BeforeEach
	public void setUp() {
		dispositivo = new Dispositivo();
	}
	
	@Test
	public void sendTest() {
		assertEquals("Wifi Prueba 47333", this.dispositivo.send("Prueba"));
		
	}
	
	
	@Test
	public void conectarConTest() {
		dispositivo.conectarCon(new _4GConecctionAdapter());
		assertEquals("4G: Prueba 47333", this.dispositivo.send("Prueba"));
		
	}
	
	@Test
	public void configurarCRCTest() {
		dispositivo.configurarCRC(new CRC32_Calculator());
		assertEquals("Wifi Prueba 1105009525", this.dispositivo.send("Prueba"));
		
	}

}
