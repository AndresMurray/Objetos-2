package ar.edu.unlp.info.oo1.Ejercicio10;

public class Mensajero {
	
	private MecanismoDeCifrado mecanismo;
	
	public String enviar(String mensaje) {
		
		return this.mecanismo.enviar(mensaje);
		
	}
	
	public String recibir(String mensaje) {
		return this.mecanismo.recibir(mensaje);
	}
	
	public void setMecanismoDeCifrado(MecanismoDeCifrado unMecanismo) {
		this.mecanismo = unMecanismo;
	}

}
