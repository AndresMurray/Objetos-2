package ejercicio2;

public interface Opcion {
	
	public String jugarContraPiedra();
	public String jugarContraPapel();
	public String jugarContraTijera();
	public String jugarContraLagarto();
	public String jugarContraSpock();
	public String ejecutarJugada(Opcion dos);

}
