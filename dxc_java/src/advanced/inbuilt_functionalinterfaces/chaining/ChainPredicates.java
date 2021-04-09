package advanced.inbuilt_functionalinterfaces.chaining;

import java.util.function.Predicate;

/*
 * P1 : Check if no is even or not
 * P2 : Check if no > 10
 */
public class ChainPredicates {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = i -> i%2 == 0; // check even
		Predicate<Integer> p2 = i -> i > 10; // check > 10
		
		int arr[] = { 10, 5,8, 7, 12, 11, 56 , 100, 30, 20 };
		
		System.out.println("Using AND :: here the numbers are printed if both cond are true");
		for (int i: arr) {
			if(p1.and(p2).test(i))
				System.out.println(i);
		}
		
		System.out.println("\nUsing OR :: here the numbers are printed if any one condition is true");
		for (int i: arr) {
			if(p1.or(p2).test(i))
				System.out.println(i);
		}
		
		System.out.println("\nUsing NOT of p1 :: here all odd numbers will be printed");
		for (int i: arr) {
			if(p1.negate().test(i))
				System.out.println(i);
		}
		
		System.out.println("\nUsing NOT of p2 :: here all the numbers which are less than equals to 10 is printed");
		for (int i: arr) {
			if(p2.negate().test(i))
				System.out.println(i);
			
		}
		
	}
	
}
