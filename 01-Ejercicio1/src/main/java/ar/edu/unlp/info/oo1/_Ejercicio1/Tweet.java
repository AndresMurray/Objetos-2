package ar.edu.unlp.info.oo1._Ejercicio1;

public class Tweet implements Publicación {
	
	private String descripcion;
	private Usuario autor;
	
	public Tweet(String desc, Usuario autor) {
	    if (cumpleLongitud(desc)) {
	        this.descripcion = desc;
	        this.autor = autor;
	    } else {
	        throw new IllegalArgumentException("El tweet debe tener entre 1 y 280 caracteres.");
	    }
	}
	
	public String getDescripcion() {			
		return this.descripcion;		
	}
	
	public boolean referenciaTweetDe(Usuario unUsuario) {
		
		return false;
				
	}
	
	
	public boolean cumpleLongitud (String descripcion) {
		return descripcion.length() >= 1 && descripcion.length() <= 280;
	}
	

	public boolean esAutor(Usuario unUsuario) {
		
		return this.autor.equals(unUsuario);
	}

}
