package ar.edu.unlp.info.oo1.Ejercicio6;

public class InscripcionProvisoria extends EstadoInscripcion {
	
	
	public void inscribir(Usuario unUsuario, Excursion excursion) {
		
		excursion.agregarInscripto(unUsuario);
		if(excursion.getCantidadInscriptos() == excursion.getCupoMinimo()) {
			excursion.setEstado(new InscripcionDefinitiva());
		}
	}
	
	public String mostrarDatosSegunEstado(Excursion excursion) {
		int faltantes = excursion.getCupoMinimo() - excursion.getCantidadInscriptos();
		return ("Usuarios faltantes para el cupo minimo:"+ faltantes);
	}

}
