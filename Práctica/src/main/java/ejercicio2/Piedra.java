package ejercicio2;

public class Piedra implements Opcion {
	
	public String jugarContraPiedra() {
		
		return "Empate";
	}
	
	public String jugarContraPapel() {
		
		return "Gana Papel";
	}
	
	public String jugarContraTijera() {
		
		return "Gana Piedra";
				
	}
	
	public String jugarContraLagarto() {
		
		return "Gana Piedra";
	}
	
	public String jugarContraSpock() {
		
		return "Gana Spock";
	}
	
	public String ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraPiedra();
		
	}
	
	

}
