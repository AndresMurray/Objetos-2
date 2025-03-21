package ar.edu.unlp.info.oo1._Ejercicio2;

public class Lagarto extends Opcion {
	
	
	
	public Resultado jugarContraPapel(Papel p) {
		
		return new Resultado (this);
	}
	
	
	
	public Resultado jugarContraSpock (Spock s) {
		
		return new Resultado (this);
	}
	
	
	public Resultado jugarContraLagarto(Lagarto l) {
		
		return new Resultado (null);
	}
	
	public Resultado ejecutarJugada (Opcion dos) {
		
		return dos.jugarContraLagarto(this);
	}
	
	@Override
    public String toString() {
        return "Lagarto"; 
    } 
	



}
