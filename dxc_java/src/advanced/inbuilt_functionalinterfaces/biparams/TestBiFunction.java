package advanced.inbuilt_functionalinterfaces.biparams;

import java.util.function.BiFunction;

import advanced.inbuilt_functionalinterfaces.Employee;

public class TestBiFunction {

	public static void main(String[] args) {
	
		BiFunction<Integer, String, Employee> bif = (i,s) -> new Employee(s,i);
		
		Employee employee = bif.apply(1234,"Rakesh");
		System.out.println(employee.name);
		
	}
	
}
