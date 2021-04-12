package advanced.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class PlayEmployees {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("rakesh", 21));
		empList.add(new Employee("Dama", 22));
		empList.add(new Employee("Royal", 20));
		
		System.out.println(empList);
		
		Comparator<Employee> comparator = (c1, c2) -> {
			
			if (c1.salary > c2.salary ) return -1;
			else if (c1.salary < c2.salary ) return 1;
			else	return 0;
			
			
		};
		
		List<Employee> sortEmp = empList.stream().sorted(comparator).collect(Collectors.toList());
		
		//sortEmp.forEach(System.out::println);  // using method reference
		System.out.println("Max is "+sortEmp.get(0).salary);
		sortEmp.stream().forEach(e -> System.out.println(e));  //using lambda
		
		try {Employee[] employees = (Employee[]) sortEmp.stream().toArray(); 
		for(Employee e:employees) {
			System.out.println(e);
		}
		} catch(Exception e) {}
		
		
		
	}

}
