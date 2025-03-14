package ejercicio1;

public class Tweet implements Publicación {
	
	private String descripcion;
	
	public Tweet (String desc) {
		this.descripcion = desc; 
	}
	
	public String getDescripcion() {			
		return this.descripcion;		
	}

}
