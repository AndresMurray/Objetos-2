package ar.edu.unlp.info.oo1.Ejercicio5;
import java.time.LocalDate;
import java.util.*;

public class Pelicula {
	
	private String titulo;
	private int añoEstreno;
	private List<Pelicula> similares;
	private double puntaje;
	
	public Pelicula(String titulo, double puntaje, int anio) {
		this.titulo= titulo;
		this.añoEstreno= anio;
		this.puntaje=puntaje;
		this.similares = new ArrayList();
	}
	
	
	public int getAnioEstreno() {
		return this.añoEstreno;
	}
	
	
	public List<Pelicula> getSimilares(){
		return this.similares; 
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
	public void setSimilar(Pelicula peli) {
		this.similares.add(peli);
	}
	
	
	
	
	
	
}
