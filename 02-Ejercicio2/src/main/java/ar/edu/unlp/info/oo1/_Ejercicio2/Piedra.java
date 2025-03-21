package ar.edu.unlp.info.oo1._Ejercicio2;

public class Piedra extends Opcion {
	
	public Resultado jugarContraPiedra(Piedra p) {
		
		return new Resultado (null);
	}
	

	public Resultado jugarContraTijera(Tijera t) {
		
		return new Resultado(this);				
	}
	
	public Resultado jugarContraLagarto(Lagarto l) {
		
		return new Resultado (this);
	}
	

	
	public Resultado ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraPiedra(this);
		
	}
	
	public String toString() {
		
		return "Piedra";
	}
	
	

}
