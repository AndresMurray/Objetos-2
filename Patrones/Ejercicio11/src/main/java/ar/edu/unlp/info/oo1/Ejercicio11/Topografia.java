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
	
	public Object getTopografia() { // RETORNO OBJETO PARA PODER COMPARAR UNA TOPOGRAFIA ATOMICA CON UNA COMPUESTA
		return this;
	}
	

	
	public boolean equals(Object object) {
		
		return this.sonIguales((Topografia)object);
	}

}
