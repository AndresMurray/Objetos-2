package ejercicio2;

public class Papel implements Opcion{
	
	public String jugarContraPiedra() {
		
		return "Gana Papel";
	}
	
	public String jugarContraPapel() {
		
		return "Empate";
	}
	
	public String jugarContraTijera() {
		
		return "Gana Tijera";
	}
	
	public String jugarContraSpock() {
		
		return "Gana Papel";
	}
	
	public String jugarContraLagarto() {
		
		return "Gana Lagarto";
	}
	
	public String ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraPapel();
	}

}
