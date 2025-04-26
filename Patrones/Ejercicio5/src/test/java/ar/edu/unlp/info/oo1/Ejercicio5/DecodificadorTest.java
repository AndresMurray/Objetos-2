package ar.edu.unlp.info.oo1.Ejercicio5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

public class DecodificadorTest {
	
	
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	public void setUp(){
		
		this.thor = new Pelicula("Thor", 7.9, 2007);
		this.capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
		this.ironMan = new Pelicula("Iron Man", 7.9, 2010);
		this.dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		this.rocky = new Pelicula("Rocky", 8.1, 1976);
		this.rambo = new Pelicula("Rambo", 7.8, 1976);
		
		thor.setSimilar(capitanAmerica);
		thor.setSimilar(ironMan);
		capitanAmerica.setSimilar(thor);
		capitanAmerica.setSimilar(ironMan);
		ironMan.setSimilar(thor);
		ironMan.setSimilar(capitanAmerica);
		rocky.setSimilar(rambo);
		rambo.setSimilar(rocky);
		
		List<Pelicula> grilaPelis = new ArrayList();
		grilaPelis.add(capitanAmerica);
		grilaPelis.add(thor);
		grilaPelis.add(ironMan);
		grilaPelis.add(dunkirk);
		grilaPelis.add(rocky);
		grilaPelis.add(rambo);
		
		List<Pelicula> pelisReproducidas = new ArrayList();
		pelisReproducidas.add(thor);
		pelisReproducidas.add(rocky);
		
		this.decodificador= new Decodificador();
		this.decodificador.setGrilla(grilaPelis);
		this.decodificador.setReproducidas(pelisReproducidas);
	}
	
	
	@Test
	public void testSimilaridad() {
		
		this.decodificador.setCriterio(new CriterioNovedad());
		assertTrue(this.decodificador.sugerirPelicula().contains(dunkirk));
		assertTrue(this.decodificador.sugerirPelicula().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPelicula().contains(ironMan));
		
		
		this.decodificador.setCriterio(new CriterioSimilaridad());
		assertTrue(this.decodificador.sugerirPelicula().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPelicula().contains(ironMan));
		assertTrue(this.decodificador.sugerirPelicula().contains(rambo));
		
		
		this.decodificador.setCriterio(new CriterioMayorPuntaje());
		assertTrue(this.decodificador.sugerirPelicula().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPelicula().contains(ironMan));
		assertTrue(this.decodificador.sugerirPelicula().contains(dunkirk));
	}
	
	

}
