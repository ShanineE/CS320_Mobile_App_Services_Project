package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

	@Test
	void test() {
		Task task = new Task("shanine", "123", "Test description");
		assertTrue(task.getName().equals("shanine"));
		assertTrue(task.getId().equals("123"));
		assertTrue(task.getDescription().equals("1234"));
	}
	@Test
	void testTaskIdToLong() {
		//Id longer than 10 characters 
		Assertions.assertThrows(IllegalArgumentException.class,  ()-> {
			new Task("shanine", "12345678910", "Test description");
			
		});
		//name longer than 20 characters
		Assertions.assertThrows(IllegalArgumentException.class,  ()-> {
			new Task("shanine Dolores Efferson", "123", "Test description");
		});
		
		//Description longer than 50 characters 
		Assertions.assertThrows(IllegalArgumentException.class,  ()-> {
			new Task("shanine", "123", "This is a test description that is longer than 50 characters ");
		});
	}
	
}
