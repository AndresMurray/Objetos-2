package ar.edu.unlp.info.oo1._Ejercicio1;
import java.util.*;

public class Twitter {
	
	private List <Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList();
	}
	
	public void eliminarUsuario(Usuario unUsuario) {
			this.usuarios.forEach(u -> u.eliminarTweetsDe(unUsuario));
			this.usuarios.remove(unUsuario);
	}
	

	public void agregarUsuario (Usuario unUsuario) {
		
		if(!validarNombre(unUsuario.getScreenName())) {
			this.usuarios.add(unUsuario);
		}
		
	}
	
	public boolean validarNombre(String name) {
		return this.usuarios.stream()
		.anyMatch(u -> u.getScreenName().equals(name));
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	
	
	
			

}
