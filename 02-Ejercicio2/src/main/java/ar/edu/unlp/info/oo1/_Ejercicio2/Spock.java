package ar.edu.unlp.info.oo1._Ejercicio2;

public class Spock extends Opcion {
	
	
	public Resultado jugarContraPiedra(Piedra p) {
		
		return new Resultado(this);
	}
	
	
	public Resultado jugarContraTijera(Tijera t) {
		
		return new Resultado(this);
	}
	

	
	public Resultado jugarContraSpock(Spock s) {
		
		return new Resultado(null);
	}
	

	
	public Resultado ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraSpock(this);
	}
	
	public String toString() {
		
		return "Spock";
	}
	


}
