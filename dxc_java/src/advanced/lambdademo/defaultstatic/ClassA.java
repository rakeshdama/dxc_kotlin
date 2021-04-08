package advanced.lambdademo.defaultstatic;

public class ClassA implements SomeInterface {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("In method 1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("In method 2");
		
	}
	
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();
		a.m2();
		a.m3();
	}

}
