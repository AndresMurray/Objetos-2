package ar.edu.unlp.info.oo1.Ejercicio3;
import java.util.*;

public class MediaPlayer {
	
	private List<Media> medias;
	
	public void play() {
		
		this.medias.stream().forEach(m -> m.play());
		
	}
	
	
	

}
