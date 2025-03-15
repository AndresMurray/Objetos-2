package ejercicio2;

public class Lagarto implements Opcion {
	
	
	
	public String jugarContraPapel() {
		
		return "Gana Lagarto";
	}
	
	public String jugarContraPiedra() {
		
		return "Gana Piedra";
		
	}
	
	public String jugarContraTijera() {
		
		return "Gana Tijera";
	}
	
	public String jugarContraSpock () {
		
		return "Gana Lagarto";
	}
	
	
	public String jugarContraLagarto() {
		
		return "Empate";
	}
	
	public String ejecutarJugada (Opcion dos) {
		
		return dos.jugarContraLagarto();
	}
	



}
