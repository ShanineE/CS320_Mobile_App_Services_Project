package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void testAddTask() {
		TaskService service = new TaskService();
		Task task = new Task("test", "test2", "test3");
		service.addTask(task);
		assertEquals(task, service.getTask("test"));

}
