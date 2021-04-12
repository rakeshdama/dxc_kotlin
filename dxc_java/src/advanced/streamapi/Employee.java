package advanced.streamapi;

public class Employee {

	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary;
	}
	
	
}
