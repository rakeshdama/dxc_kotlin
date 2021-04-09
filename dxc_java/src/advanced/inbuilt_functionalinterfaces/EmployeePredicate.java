package advanced.inbuilt_functionalinterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate {

	static ArrayList<Employee> employees;
	
	public static void main(String[] args) {
		
		populateEmployees();
		Predicate<Employee> p = (e) -> e.salary > 10000;
		
		for (Employee e: employees) {
			
			if (p.test(e)) {
				System.out.println(e.name);
			}
			
		}
		
	
		
	}
	
	private static void populateEmployees() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("Rakesh", 155000));
		employees.add(new Employee("Dama", 15000));
		employees.add(new Employee("Sridhar", 55000));
		employees.add(new Employee("maname", 6000));
		employees.add(new Employee("manade", 5000));

	}
	
}
