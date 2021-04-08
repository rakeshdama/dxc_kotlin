package advanced.lambdademo.defaultstatic;

public class ClassB implements SomeInterface {

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
	
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		//SomeInterface.super.m3();
		System.out.println("in m3");
	}
	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.m1();
		b.m2();
		b.m3();
	}
}
