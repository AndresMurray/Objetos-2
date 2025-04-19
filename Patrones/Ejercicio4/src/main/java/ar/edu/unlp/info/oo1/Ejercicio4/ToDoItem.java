package ar.edu.unlp.info.oo1.Ejercicio4;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class ToDoItem {
	
	private State state;
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private List<String> comments;
	
	public ToDoItem (String name) {
		this.name = name;
		this.state = new Pending();
		this.comments = new ArrayList<String>();
	}
	
	 public void setStartDate() {
			this.startDate = LocalDateTime.now();
	}
		
	 public void setEndDate() {
			this.endDate = LocalDateTime.now();
	}
		
	public LocalDateTime getStartDate() {
			return startDate;
	}

	public LocalDateTime getEndDate() {
			return endDate;
	}
	
	public List<String> getComments(){
		return this.comments;
	}
	
	public void start() {
		this.state.start(this);
		
	}
	
	public void togglePause() {
		this.state.togglePause(this);
	}
	
	public void finish() {
		this.state.finish(this);
	}
	
	public void setState(State state) {
		this.state=state;
	}
	
	public Duration workedTime() {
		return this.state.workedTime(this);	
	}
	
	public void addComment(String comment) {
		this.state.addComment(this,comment);
	}
	
	public State getState() {
		return this.state;
	}

}
