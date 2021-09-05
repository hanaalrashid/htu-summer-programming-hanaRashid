package eventdriven;

public class Employee {
	private int id; 
	private String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee id is " + id + " and his name is " + name;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}
	public Employee(int id) {
		super();
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
