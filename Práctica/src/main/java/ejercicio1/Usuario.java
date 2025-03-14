package ejercicio1;
import java.util.*;

public class Usuario {
	
	private List<Publicación> tweets;
	private String screenName;
	
	
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList();
	}

	public String getScreenName() {
		return screenName;
	}
	
	public void borrarTweets() {
		this.tweets.removeAll(tweets);
	}
	
	public void realizarPost(String descripcion) {
		if(cumpleLongitud(descripcion)) {
			Tweet tweet = new Tweet(descripcion);
			this.tweets.add(tweet);
		}
	}
	
	public void reTwitear(Tweet unTweet) {
		ReTweet tweet = new ReTweet(unTweet);
		this.tweets.add(tweet);
		
	}
	
	public String leerPost(Publicación publicacion) {
		if(cumpleLongitud(publicacion.getDescripcion())) {
			return publicacion.getDescripcion();
		}
		return null;
		
	}
	
	public boolean cumpleLongitud (String descripcion) {
		return descripcion.length() >= 1 && descripcion.length() <= 280;
	}

	public List<Publicación> getTweets() {
		return tweets;
	} 
	
	
	
	

}				
