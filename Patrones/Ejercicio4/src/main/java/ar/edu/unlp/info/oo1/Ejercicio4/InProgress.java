package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State{
	
	public void start(ToDoItem item) {
	}
	
	public void togglePause(ToDoItem item) {
		item.setState(new Paused());
	}
	
	public void finish(ToDoItem item) {
		item.setState(new Finished());
		item.setEndDate();
	}
	
	
	public Duration workedTime(ToDoItem state) {
		return Duration.between(state.getStartDate(), LocalDateTime.now());
	}
	
	

}
