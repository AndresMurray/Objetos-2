package ar.edu.unlp.info.oo2.biblioteca;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class BibliotecaTest {
	
	private Biblioteca biblioteca;
	private Biblioteca bibliotecaDos;
	
	@BeforeEach
	public void setUp() throws Exception{
		biblioteca = new Biblioteca();
		bibliotecaDos = new Biblioteca();
		bibliotecaDos.setExporter(new JsonAdapter());
	}
	
	
	@Test
	public void testExportarSocios() {
		assertTrue(biblioteca.exportarSocios().contains("[]"));
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		assertTrue(biblioteca.exportarSocios().contains("Arya Stark"));
		assertTrue(biblioteca.exportarSocios().contains("Tyron Lannister"));
		
	}
	
	
	public void testExportarSociosConJson () {
		
		assertTrue((this.bibliotecaDos.exportarSocios()).contains("[]"));
		bibliotecaDos.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		bibliotecaDos.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		assertTrue((this.bibliotecaDos.exportarSocios()).contains("Arya Stark"));
		
	
	}


}
