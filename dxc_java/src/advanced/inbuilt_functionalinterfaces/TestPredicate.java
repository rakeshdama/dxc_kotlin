package advanced.inbuilt_functionalinterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i % 2 == 0;
		// Predicate is a functional interface, which accepts an argument and returns a boolean
		
		// p.test(arg) -- > it returns true or false based on the given expression in predicate
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(p.test(n) ? "even" : "odd");
		
		sc.close();
		
	}
}
