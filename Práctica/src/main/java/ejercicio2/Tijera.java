package ejercicio2;

public class Tijera implements Opcion{
	
	
	public String jugarContraPiedra() {
		
		return "Gana Piedra";
	}
	
	public String jugarContraPapel() {
		
		return "Gana Tijera";
	}
	
	public String jugarContraTijera() {
		
		return "Empate";
				
	}
	
	public String jugarContraLagarto() {
		
		return "Gana Tijera";
	}
	
	public String jugarContraSpock() {
		
		return "Gana Spock";
	}
	
	
	public String ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraTijera();
	}


}
