package gym;

public class Training_Device {
	private String name;
	private String type;
	private String muscle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMuscle() {
		return muscle;
	}
	public void setMuscle(String muscle) {
		this.muscle = muscle;
	}
	public Training_Device(String name, String type, float timetowork, float pulse) {
		
		this.name = name;
		this.type = type;
		this.muscle = null;
		

	}

	
	public Training_Device(String name, String type, String muscle) {
		super();
		this.name = name;
		this.type = type;
		this.muscle = muscle;
	}
	
	
}
