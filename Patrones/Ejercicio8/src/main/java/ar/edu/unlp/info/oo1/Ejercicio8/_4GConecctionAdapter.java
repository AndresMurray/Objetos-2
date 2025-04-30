package ar.edu.unlp.info.oo1.Ejercicio8;

public class _4GConecctionAdapter implements Connection {
	
	private _4GConnection adaptee;
	
	public _4GConecctionAdapter() {
		this.adaptee = new _4GConnection();
	}
	
	
	@Override
	public String pict() {
		return adaptee.getSymb();
	}


	@Override
	public String sendData(String data, long crc) {
		return adaptee.transmitir(data, crc);
	}
	
	
	
	
	

}
