package ar.edu.unlp.info.oo1.Ejercicio6;

public abstract class EstadoInscripcion {
	
	public abstract void inscribir(Usuario unUsuario, Excursion excursion) ;
	
	
    public String mostrarInformacion(Excursion excursion) {
      return  mostrarDatosBasicos(excursion) +  // nombre, costo, fechas, punto de encuentro
        mostrarDatosSegunEstado(excursion); // Hook: lo personaliza cada subclase
    }
    
    private String mostrarDatosBasicos(Excursion excursion) {
        return "Nombre: " + excursion.getNombre() + "\n" +
               "Costo: $" + excursion.getCosto() + "\n" +
               "Fecha de inicio: " + excursion.getFechaInicio() + "\n" +
               "Fecha de fin: " + excursion.getFechaFin() + "\n" +
               "Punto de encuentro: " + excursion.getPuntoEncuentro() + "\n";
    }

    
    
    protected abstract String mostrarDatosSegunEstado(Excursion excursion);

}
