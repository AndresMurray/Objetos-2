package ejercicio2;

public class Spock implements Opcion {
	
	
	public String jugarContraPiedra() {
		
		return "Gana Spock";
	}
	
	
	public String jugarContraTijera() {
		
		return "Gana Spock";
	}
	
	public String jugarContraPapel() {
		
		return "Gana Papel";
	}
	
	public String jugarContraSpock() {
		
		return "Empate";
	}
	
	public String jugarContraLagarto() {
		
		return "Gana Lagarto";
	}
	
	public String ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraSpock();
	}


}
