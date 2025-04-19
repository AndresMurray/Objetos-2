package ar.edu.unlp.info.oo1.Ejercicio4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	
	private ToDoItem task;
	
	
	@BeforeEach
	public void setUp(){
		
		this.task = new ToDoItem("practica");
	}
	
	
	@Test
	public void testPending() {
		assertTrue(this.task.getState() instanceof Pending);
	}
	
	public void testInProgress() {
		task.start();
		assertTrue(this.task.getState() instanceof InProgress);
	}
	
	public void testFinished() {
		task.finish();
		assertTrue(this.task.getState() instanceof Finished);
	    assertThrows(UnsupportedOperationException.class, () -> {
	        task.start();
	    });
		
	}
	

}
