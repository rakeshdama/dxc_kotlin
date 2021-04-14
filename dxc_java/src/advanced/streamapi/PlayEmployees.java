package advanced.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class PlayEmployees {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("a", 21));
		empList.add(new Employee("b", 22));
		empList.add(new Employee("c", 20));
		empList.add(new Employee("d", 23));
		
		System.out.println("Before "+empList);
		
		Comparator<Employee> comparator = (c1, c2) -> {
			
			if (c1.salary > c2.salary ) return -1;
			else if (c1.salary < c2.salary ) return 1;
			else	return 0;
			
			
		};
		
		List<Employee> sortEmp = empList.stream().sorted(comparator).collect(Collectors.toList());
		
		//List<Employee> minSalary = empList.stream().min((c1, c2) -> c2.compareTo(c1)).get();
  		
		//sortEmp.forEach(System.out::println);  // using method reference
		//System.out.println("Max is "+sortEmp.get(0).salary);
//		sortEmp.stream().forEach(e -> System.out.println(e));  //using lambda
//		
//		try {Employee[] employees = (Employee[]) sortEmp.stream().toArray(); 
//		for(Employee e:employees) {
//			System.out.println(e);
//		}
//		} catch(Exception e) {}
//		
		
		
		List<Employee> mapFlat = empList.stream().flatMap(list -> empList.stream()).collect(Collectors.toList());
		
		System.out.println("After "+mapFlat);
	}

}
