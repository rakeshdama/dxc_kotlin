package advanced.lambdademo;

import java.util.function.Function;

/*
 * Lambda was introduced to make code concise.
 *  public int square(int n) { return n*n}
 *  
 *  To get a lambda expression from above method we will remove 
 *  
 *  1. Modifier -- public
 *  2. Return type -- int
 *  3. Method Name
 *  
 *  int n -> n*n   ===> n -> n*n  (This is the lambda expressions.
 *  
 *  Lambda Expressions ==>
 *  
 *  	Function f = n -> n*n;
 *  	f.apply(4);
 *  
 *  	here function is a interface.
 *  
 *  	In case of Lambda expressions .class file is not generated.
 *  
 *  	The symbol of Lambda is ( -> )
 * 
 *   	1. Functional Interfaces.
 *   	2. Default and static methods
 *   	3. Predefined functional interfaces
 *   		a. Predicate
 *   		b. Function
 *   		c. Consumer
 *  	 	d. Supplier
 *  
 *  	Functional Interface  =>
 *  		If a interface having only one abstract method its called functional interface.
 *  		We can mark an interface as functional with the annotation @FunctionalInterface.
 *  	
 *  	A marker interface is an interface that has no methods or constants inside it. 
 *  
 *  	Functional Interface wrt inheritance
 *  
 *			@FunctionalInterface  
 *  		Interface A{
 *  			public void m1();
 *  		}
 *  	
 *  		Interface B extends A{
 *  			public void m2()
 *  		}
 *  
 *  		
 *
 */
public class FirstLambda {

	public static void main(String[] args) {
	
		Function<Integer, Integer> f = a -> a+a;
		System.out.println(f.apply(5));
		
		FunctionalInterface2 f2 = (n,n2) -> n*n2;
		System.out.println(f2.Isum(5,1));
		
		FunctionalInterface2 f1 = (a,b) -> a+b;
		System.out.println("the sum from our functional interface  " +f1.Isum(5, 4));
		
		FunctionalInterface1 fi = () -> {System.out.println("Hello from lambda");};
		fi.m1();
		
	}
	
}
