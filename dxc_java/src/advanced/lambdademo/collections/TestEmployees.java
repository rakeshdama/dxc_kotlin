package advanced.lambdademo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Rakesh", 20));
		employees.add(new Employee("Dama", 19));
		employees.add(new Employee("Rakesh Dama", 21));
				
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println("\nAfter sorting");
		
		Comparator<Employee> c = (e1,e2) -> (e1.eid < e2.eid)? -1 : (e1.eid > e2.eid) ? 1 : 0;

		Collections.sort(employees, c);
	
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

}
