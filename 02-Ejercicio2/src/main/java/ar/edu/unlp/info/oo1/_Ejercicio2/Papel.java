package ar.edu.unlp.info.oo1._Ejercicio2;

import java.util.Optional;

public class Papel extends Opcion{
	
	public Resultado jugarContraPiedra(Piedra p) {
		
		return new Resultado(this);//this
	}
	
	public Resultado jugarContraPapel(Papel p) {
		 
		return new Resultado(null);
	}
	
	
	public Resultado jugarContraSpock(Spock s) {
		
		return new Resultado(this);
	}
	
	
	
	public Resultado ejecutarJugada(Opcion dos) {
		
		return dos.jugarContraPapel(this);
	}
	
	public String toString() {
		
		return "Papel";
	}
	

}
