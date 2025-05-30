package ar.edu.unlp.info.oo1.Ejercicio10;

public class FeistelCipherAdapter implements MecanismoDeCifrado{
	
	private FeistelCipher adaptee;
	
	
	public FeistelCipherAdapter(String key) {
		this.adaptee = new FeistelCipher(key);
		
	}
	
	
	public String enviar(String mensaje) {
		return this.adaptee.encode(mensaje);
	}

	@Override
	public String recibir(String mensaje) {
		return this.adaptee.encode(mensaje);
		
	}
	
	

}
