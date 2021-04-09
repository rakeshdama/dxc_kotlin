package advanced.inbuilt_functionalinterfaces.unarybinary;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class TestBinaryOperator {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> bif = (s1, s2) -> s1 + s2 ;
		System.out.println(bif.apply("Rakesh ", "Dama"));
		
		BinaryOperator<String> bo = (s1, s2) -> s1 + s2 ;
		System.out.println(bo.apply("Rakesh ", "Royal"));
		
	}
}
