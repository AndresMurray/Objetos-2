package ar.edu.unlp.info.oo1.Ejercicio15;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	
	private String nombre;
	private LocalDate fechaCreacion;
	private Catalogo catalogo;
	private List<Componente> misComponentes;
	
	
	public Presupuesto() {
		
		this.fechaCreacion = LocalDate.now();
		this.misComponentes = new ArrayList();
		
	}


	public void setComponente(String componente) {
		this.misComponentes.add(catalogo.getComponente(componente));
		
	}
	
	public void setNombre(String nombre) {
		this.nombre= nombre;
		
	}
	
	public List<Componente> getComponentes(){
		return this.misComponentes;
	}
	
	
	public double getConsumoEquipo() {
		
		return this.misComponentes.stream()
				.mapToDouble(c -> c.getConsumo())
				.sum();
		
	}
	
	public double getPrecioEquipo() {
		
		return this.misComponentes.stream()
				.mapToDouble(c -> c.getPrecio())
				.sum()*1.21;
	}
	

}
