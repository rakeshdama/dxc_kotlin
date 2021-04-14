package advanced.inbuilt_functionalinterfaces.function;

import java.util.function.Function;

// Functional Interface Represents a function that accepts one argument and produces a result.
 

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function< Integer, Integer> f = i -> (i/2);
		System.out.println(f.apply(16));
		
		Function< String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Rakesh Dama"));
		
		Function<String, String> f3 = s-> s;
		System.out.println(f3.apply("Rakesh"));
		
		Function<String, String> f4 = s-> s.toUpperCase();
		System.out.println(f4.apply("Rakesh"));
		
	}
	
	
}
