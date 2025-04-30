package ar.edu.unlp.info.oo1.Ejercicio8;
import java.util.zip.CRC32;

public class CRC32_Calculator implements CalculatorStrategy {
	
	
    @Override
    public long crcFor(String data) {
        CRC32 crc = new CRC32();
        crc.update(data.getBytes());
        return crc.getValue();
    }
	

}
