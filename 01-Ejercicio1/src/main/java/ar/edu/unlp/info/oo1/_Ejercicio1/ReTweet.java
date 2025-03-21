package ar.edu.unlp.info.oo1._Ejercicio1;

public class ReTweet implements Publicación{
	
	private Tweet origen;
	
	public ReTweet(Tweet origen) {
		this.origen=origen;
	}
	
	public String getDescripcion() {
		return this.origen.getDescripcion();
	}
	
	public boolean referenciaTweetDe(Usuario unUsuario) {
		
		return this.origen.esAutor(unUsuario);
		
	}

}
