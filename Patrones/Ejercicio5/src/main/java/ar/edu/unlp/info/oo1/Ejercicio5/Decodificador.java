package ar.edu.unlp.info.oo1.Ejercicio5;
import java.util.*;

public class Decodificador {
	
	private Criterio criterio;
	private List<Pelicula> grillaDePeliculas;
	private List<Pelicula> reproducidas;
	
	
	public Decodificador () {
		this.grillaDePeliculas = new ArrayList();
		this.reproducidas = new ArrayList();
	}
	
	public void setCriterio(Criterio unCriterio) {
		this.criterio = unCriterio;
	}
	
	public void reproducirPelicula(Pelicula unaPelicula) {
		this.reproducidas.add(unaPelicula);
	}
	
	public List<Pelicula> sugerirPelicula(){
		return this.criterio.sugerir(this);
	}

	public List<Pelicula> getGrillaDePeliculas() {
		return grillaDePeliculas;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}

	public void setGrilla(List<Pelicula> pelis) {
		this.grillaDePeliculas=pelis;
		
	}

	public void setReproducidas(List<Pelicula> pelis) {
		this.reproducidas= pelis;
		
	}
	
	
	
	
}
