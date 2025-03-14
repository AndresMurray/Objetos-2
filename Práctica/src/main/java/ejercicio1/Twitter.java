package ejercicio1;
import java.util.*;

public class Twitter {
	
	private List <Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList();
	}
	
	public void eliminarUsuario(Usuario unUsuario) {
		if(existeUsuario(unUsuario)){
			unUsuario.borrarTweets();
			this.usuarios.remove(unUsuario);
			
		}
	
	}
	
	public boolean existeUsuario(Usuario unUsuario) {
		return	this.usuarios.stream()
				.anyMatch(u -> u.getScreenName().equals(unUsuario.getScreenName()));
	}
	
	public void agregarUsuario (Usuario unUsuario) {
		
		if(!validarNombre(unUsuario.getScreenName())) {
			this.usuarios.add(unUsuario);
		}
		
	}
	
	public boolean validarNombre(String name) {
		return this.usuarios.stream()
		.allMatch(u -> u.getScreenName().equals(name));
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	
	
	
			

}
