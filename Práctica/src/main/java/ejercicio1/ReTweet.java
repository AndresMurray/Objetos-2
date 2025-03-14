package ejercicio1;

public class ReTweet implements Publicación{
	
	private Tweet origen;
	
	public ReTweet(Tweet origen) {
		this.origen=origen;
	}
	
	public String getDescripcion() {
		return this.origen.getDescripcion();
	}

}
