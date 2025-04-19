package ar.edu.unlp.info.oo1.Ejercicio4;
import java.time.Duration;

public class Pending extends State{
	
	public void start(ToDoItem item) {
		item.setState(new InProgress());
		item.setStartDate();
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public Duration workedTime(ToDoItem state) {
		throw new RuntimeException("El Item nunca fue iniciado");
	}
	

}
