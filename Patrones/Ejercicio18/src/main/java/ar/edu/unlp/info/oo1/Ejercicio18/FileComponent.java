package ar.edu.unlp.info.oo1.Ejercicio18;
import java.time.*;

public interface FileComponent {
	
	public String prettyPrint ();
	
	public String getNombre();
	public String getExtension();
	public String getTamaño();
	public LocalDate getFechaDeCreacion();
	public LocalDate getFechaDeModificacion();
	public String getPermisos();
	
	
	

}
