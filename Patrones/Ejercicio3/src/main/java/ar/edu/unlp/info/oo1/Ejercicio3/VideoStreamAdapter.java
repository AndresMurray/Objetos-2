package ar.edu.unlp.info.oo1.Ejercicio3;

public class VideoStreamAdapter extends Media {
	
	private VideoStream videoStream;
	
	public String play() {
		return this.videoStream.reproduce();
		
	}
	
	

}
