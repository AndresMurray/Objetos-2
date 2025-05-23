package ar.edu.unlp.info.oo1.Ejercicio11;
import java.util.*;

public abstract class Topografia {
	
	public abstract double getProporcionAgua();
	
	public double getProporcionTierra() {
		return 1-this.getProporcionAgua();
	}
	
	public boolean sonIguales(Topografia topografia) {
		return (this.getProporcionAgua()== topografia.getProporcionAgua());
	}
	
	public Object getTopografias() { // RETORNO OBJETO PARA PODER COMPARAR UNA TOPOGRAFIA ATOMICA CON UNA COMPUESTA
		return null;
	}
	

	
	public boolean equals(Object object) {
		
		//return this.sonIguales((Topografia)object);
		return ((Topografia)object).sonIguales(this);
	}

}
