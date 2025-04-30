package ar.edu.unlp.info.oo1.Ejercicio8;

public class _4GConnection {
	
	private String symb;
	
	public String transmitir(String data, long crc) {
		
		return "4G: " + data + " " + crc;
	}
	
	public String getSymb() {
		return this.symb;
	}

}
