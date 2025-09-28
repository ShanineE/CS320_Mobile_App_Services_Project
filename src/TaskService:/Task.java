package test;

public class Task {
	private String id;
	private String name; 
	private String description; 
	
	public Task(String id, String name, String description) {
		if (id == null || id.length()> 10){
			//testing the exception for ID
			throw new IllegalArgumentException("Invalid input");
		}
		if (name == null || name.length()> 20) {
			throw new IllegalArgumentException("Invalid Input");
		}
		if (description == null || description.length() > 50){
			throw new IllegalArgumentException("Invalid input");
		}
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description; 
	}
	
	
}
