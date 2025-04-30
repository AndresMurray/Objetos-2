package ar.edu.unlp.info.oo1.Ejercicio8;

public class Dispositivo {
	
	private Ringer ringer;
	private Connection connection;
	private Display display;
	private CalculatorStrategy crcCalculator;
	
	public Dispositivo() {
		this.crcCalculator = new CRC16_Calculator();
		this.display = new Display();
		this.connection = new WifiConn();
		this.ringer = new Ringer();
	}
	
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void configurarCRC(CalculatorStrategy crc) {
		this.crcCalculator= crc;
	}
	
	public void conectarCon (Connection connection) {
		this.connection= connection;
		ringer.ring();
		connection.pict();
	}
	
	
}
