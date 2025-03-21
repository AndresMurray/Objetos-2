package ar.edu.unlp.info.oo1._Ejercicio2;

public class Tijera extends Opcion{
	
	
	
	
	public Resultado jugarContraPapel(Papel p) {
		
		return new Resultado(this);
	}
	
	public Resultado jugarContraTijera(Tijera t) {
		
		return new Resultado(null);
				
	}
	
	public Resultado jugarContraLagarto(Lagarto l) {
		
		return new Resultado(this);
	}
	

	
	
	public Resultado ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraTijera(this);
	}
	
	public String toString() {
		
		return "Tijera";
	}
	


}
