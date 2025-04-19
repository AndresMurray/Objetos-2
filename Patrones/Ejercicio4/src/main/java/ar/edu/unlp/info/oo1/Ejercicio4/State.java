package ar.edu.unlp.info.oo1.Ejercicio4;
import java.time.Duration;

public abstract class State {
	
	public void start(ToDoItem item) {};
	
	public void finish(ToDoItem item) {};
	
	public void addComment(ToDoItem item,String comment) {
		item.getComments().add(comment);
	}
	
	public abstract void togglePause(ToDoItem item) ;
	
	public abstract Duration workedTime(ToDoItem item);

}
