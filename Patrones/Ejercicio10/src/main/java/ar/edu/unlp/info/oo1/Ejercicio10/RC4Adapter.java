package ar.edu.unlp.info.oo1.Ejercicio10;

public class RC4Adapter implements MecanismoDeCifrado{
	
	private RC4 adaptee;
	private String key;
	
	
	public RC4Adapter(String key) {
		this.key=key;
		this.adaptee = new RC4();
	}

	@Override
	public String enviar(String mensaje) {
		return adaptee.encriptar(mensaje, key);
		
	}

	@Override
	public String recibir(String mensaje) {
		return adaptee.desencriptar(mensaje, key);
		
	}
	

}
