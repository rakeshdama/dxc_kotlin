package advanced.inbuilt_functionalinterfaces.primitive;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class TestIntPredicate {
	
	public static void main(String[] args) {
		
		IntPredicate p = i -> i % 2 == 0;
		
		Predicate<Integer> p1 = i -> i % 2 == 0;
		
		System.out.println(p.test(10));
		
		System.out.println(p1.test(12));
		
		
	}

}