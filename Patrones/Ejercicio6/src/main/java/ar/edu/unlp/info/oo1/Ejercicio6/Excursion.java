package ar.edu.unlp.info.oo1.Ejercicio6;
import java.util.*;
import java.time.*;

public class Excursion {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private EstadoInscripcion estado;
	private List<Usuario> usuariosInscriptos;
	private List<Usuario> usuariosEnEspera;
	
	
	
	public Excursion(String nombre, int cupoMinimo, int cupoMaximo, LocalDate fechaInicio, LocalDate fechaFin,
			String puntoEncuentro, double costo) {
		
		this.nombre= nombre;
		this.cupoMinimo=cupoMinimo;
		this.cupoMaximo=cupoMaximo;
		this.usuariosEnEspera=new ArrayList();
		this.usuariosInscriptos=new ArrayList();
		this.estado= new InscripcionProvisoria();
		this.fechaFin= fechaFin;
		this.fechaInicio = fechaInicio;
		this.puntoEncuentro=puntoEncuentro;
		this.costo= costo;
		
	}
	
	
	public void agregarInscripto(Usuario unUsuario) {	
			this.usuariosInscriptos.add(unUsuario);
			
	}
	
	
	public void agregarAEspera(Usuario unUsuario) {
		
		this.usuariosEnEspera.add(unUsuario);
		
	}
	
	
	public void inscribir(Usuario unUsuario) {
		
		this.estado.inscribir(unUsuario, this);
	}
	
	public  String obtenerInformacion() {
		return this.estado.mostrarInformacion(this);
		
	}
	
	public int getCantidadInscriptos() {
		return this.usuariosInscriptos.size();
	}


	public int getCupoMinimo() {
		return cupoMinimo;
	}


	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}


	public int getCupoMaximo() {
		return cupoMaximo;
	}


	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}


	public EstadoInscripcion getEstado() {
		return estado;
	}


	public void setEstado(EstadoInscripcion estado) {
		this.estado = estado;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public String getNombre() {
		return nombre;
	}


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}


	public LocalDate getFechaFin() {
		return fechaFin;
	}


	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}


	public double getCosto() {
		return costo;
	}
	
	public List<Usuario> getInscriptos(){
		return this.usuariosInscriptos;
	}
	
	
	
	public List<Usuario> getListaEspera(){
		return this.usuariosEnEspera;
	}
	
	
	
	
	
	

}
