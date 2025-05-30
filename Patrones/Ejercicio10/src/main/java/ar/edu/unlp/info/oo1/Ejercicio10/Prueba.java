package ar.edu.unlp.info.oo1.Ejercicio10;

public class Prueba {

	public static void main(String[] args) {
		
		Mensajero m = new Mensajero();
		m.setMecanismoDeCifrado(new FeistelCipherAdapter("clave"));
		m.enviar("hola");
		System.out.println(m.enviar("hola"));
		
		
		m.setMecanismoDeCifrado(new RC4Adapter("tu clave"));
		m.enviar("asf");
		

	}

}
