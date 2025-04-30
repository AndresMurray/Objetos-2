package ar.edu.unlp.info.oo1.Ejercicio8;

public class WifiConn implements Connection{
	
	private String pict;
	
	public String sendData(String data, long crc) {
		return "Wifi " + data + " " + crc;
	}
	
	public String pict() {
		return "Simbolo de wifi";
	}

}
