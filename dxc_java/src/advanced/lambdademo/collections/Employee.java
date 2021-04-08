package advanced.lambdademo.collections;

public class Employee {
	
	String name;
	int eid;
	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid+", "+name;
	}

}
