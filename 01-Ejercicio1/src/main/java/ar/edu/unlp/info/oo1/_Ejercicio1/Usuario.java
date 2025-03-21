package ar.edu.unlp.info.oo1._Ejercicio1;
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
	
	
	 public Tweet realizarPost(String desc) {
	        try {
	            Tweet nuevoTweet = new Tweet(desc, this);
	            this.tweets.add(nuevoTweet);
	            return nuevoTweet; 
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	            return null; 
	        }
	    }
	
	public void reTwitear(Tweet unTweet) {
		ReTweet tweet = new ReTweet(unTweet);
		this.tweets.add(tweet);
		
	}
	

	public List<Publicación> getTweets() {
		return tweets;
	}

	public void eliminarTweetsDe(Usuario unUsuario) {
		List<Publicación> reTweets= this.tweets.stream().filter(t -> t.referenciaTweetDe(unUsuario)).toList();
		this.tweets.removeAll(reTweets);
	}
	
	
	


}				
