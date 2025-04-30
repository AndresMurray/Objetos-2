package ar.edu.unlp.info.oo1.Ejercicio6;

public class InscripcionCompleta extends EstadoInscripcion {
	
	public void inscribir(Usuario unUsuario, Excursion excursion) {	
		
		excursion.agregarAEspera(unUsuario);
	}
	
	
	public String mostrarDatosSegunEstado(Excursion excursion) {
		return ("");
	}

}
