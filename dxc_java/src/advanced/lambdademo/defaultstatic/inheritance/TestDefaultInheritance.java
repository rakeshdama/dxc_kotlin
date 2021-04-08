package advanced.lambdademo.defaultstatic.inheritance;

public class TestDefaultInheritance implements Left, Right{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		//Left.super.m1();
		Right.super.m1();
		System.out.println("This is overridden");
	}
	
	public static void main(String[] args) {
		TestDefaultInheritance test = new TestDefaultInheritance();
		test.m1();
		// test.m12();
	}

}
