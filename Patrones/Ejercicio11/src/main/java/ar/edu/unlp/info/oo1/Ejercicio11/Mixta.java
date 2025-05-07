package ar.edu.unlp.info.oo1.Ejercicio11;
import java.util.*;


public class Mixta extends Topografia{
	
	private List <Topografia> topografias;
	
	
	
	public Mixta (Topografia componente1,Topografia componente2,Topografia componente3,Topografia componente4) {
		
		this.topografias = new ArrayList();
		this.topografias.add(componente1);
		this.topografias.add(componente2);
		this.topografias.add(componente3);
		this.topografias.add(componente4);
		
		
	}
	
	
	
	
	public double getProporcionAgua() {
		return (this.topografias.stream().mapToDouble(t -> t.getProporcionAgua()).sum())/4;
	}
	
	public List<Topografia> getTopografia (){
		return this.topografias;
	}
	
	
	public boolean sonIguales(Topografia otraTopografia) {
		
		return this.topografias.equals(otraTopografia.getTopografia());
	}
	
	

}
