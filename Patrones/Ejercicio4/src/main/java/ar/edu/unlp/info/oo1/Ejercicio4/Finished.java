package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;


public class Finished extends State {

	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public Duration workedTime(ToDoItem state) {
		return Duration.between(state.getStartDate(), state.getEndDate());
	}
	
	public void addComment(ToDoItem item,String comment) {
	}
}
