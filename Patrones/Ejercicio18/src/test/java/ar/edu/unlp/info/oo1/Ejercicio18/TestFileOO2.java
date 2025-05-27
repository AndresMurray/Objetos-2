package ar.edu.unlp.info.oo1.Ejercicio18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFileOO2 {
	
	private FileComponent a;
	private FileDecorator b;
	private FileDecorator c;
	private FileDecorator d;
	
	@BeforeEach
	void setUp() {
		
		 this.a= new FileOO2 ("Imagen", ".png", "10MB", LocalDate.of(2020, 3, 5), LocalDate.now(), "permiso total");
	
	}
	
	
	@Test
	public void testPreetyPrintConExtension() {
		this.b= new ExtensionDecorator(a);
		assertEquals("Imagen-.png", b.prettyPrint());
	}
	
	
	@Test
	public void testPreetyPrintConFechaCreacionYExtension() {
		this.b= new FechaCreacionDecorator(a);
		this.c = new ExtensionDecorator(b);
		assertEquals("Imagen-2020-03-05-.png", c.prettyPrint());
	}
	//nombre - tamaño - permisos - extensión
	
	
		
	@Test
	public void testPreetyPrintContamañoPermisosExtension() {
		this.b= new TamañoDecorator(a);
		this.c = new PermisosDecorator(b);
		this.d = new ExtensionDecorator(c);
		assertEquals("Imagen-10MB-permiso total-.png", d.prettyPrint());
	}

}
