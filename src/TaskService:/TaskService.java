

import java.util.HashMap;
import java.util.Map;


public class TaskService {
	
	private Map<String, Task> tasks = new HashMap<>();
	//ADD A NEW TASK
	public Task addTask(String name, String description ) {
		Task task = new Task(name, description, description);
		tasks.put(task.getId(), task);
		return task;
	}
	
	//DELETE A TASK
	public void deleteTask(String id) {
		if (tasks.containsKey(id)) {
			tasks.remove(id);
		return;
		}
	}
}