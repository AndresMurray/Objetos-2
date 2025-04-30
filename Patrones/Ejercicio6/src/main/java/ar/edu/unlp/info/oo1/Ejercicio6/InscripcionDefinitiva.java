package ar.edu.unlp.info.oo1.Ejercicio6;

public class InscripcionDefinitiva  extends EstadoInscripcion{
	
	public void inscribir(Usuario unUsuario, Excursion excursion) {
		
		if(excursion.getCantidadInscriptos() < excursion.getCupoMaximo()) {
			excursion.agregarInscripto(unUsuario);}
		if(excursion.getCantidadInscriptos() == excursion.getCupoMaximo()) {
			excursion.setEstado(new InscripcionCompleta());
		}
	}
	
	public String mostrarDatosSegunEstado(Excursion excursion) {
	    int faltantes = excursion.getCupoMaximo() - excursion.getCantidadInscriptos();
	    String mails = excursion.getInscriptos().stream()
	        .map(usuario -> usuario.getEmail())
	        .reduce("", (a, b) -> a + " " + b);

	    return "Usuarios inscriptos: " + mails + " | Faltantes para el cupo máximo: " + faltantes;
	}

}
