package advanced.lambdademo.anonymous;

/*
 * If an anonymous class implements an interface which has only one abstract method then we can use lambda
 * Anonymous class can extend interface which has more than one abstract method.
 * Anonymous class can extend from normal class and an abstract class.
 */

public class Test {

	public static void main(String[] args) {
		
		Interface2 i2 = new Interface2(){

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("m1 --- interface");
				
			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("m2 --- interface");
				
			}
			
		};
		i2.m1();
		i2.m2();
	}
	
}
