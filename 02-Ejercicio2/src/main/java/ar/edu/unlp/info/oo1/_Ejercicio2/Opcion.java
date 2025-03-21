package ar.edu.unlp.info.oo1._Ejercicio2;

public abstract class Opcion {
	
	public Resultado jugarContraPiedra(Piedra p) {
		
		return new Resultado(p);//this
	}
	
	public Resultado jugarContraPapel(Papel p) {
			return new Resultado (p);
	}
	

	public Resultado jugarContraTijera(Tijera t) {
	
		return new Resultado(t);
	}
	
	
	public Resultado jugarContraLagarto(Lagarto l) {
		
			return new Resultado(l);
	}
	
	public Resultado jugarContraSpock(Spock s) {
		
		return new Resultado(s);
	}
	
	
	public abstract Resultado ejecutarJugada(Opcion dos);

}
