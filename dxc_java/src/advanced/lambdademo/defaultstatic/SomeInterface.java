package advanced.lambdademo.defaultstatic;

public interface SomeInterface {
	
	public void m1();
	public void m2();
	
	/*
	 * If we want to update any method then other classes implementing this throws err thus we can use default.
	 * and we define the implementation here.
	 * We call it as defender because it'll provide default implementation for all concrete classes.
	 * we can't provide default in class or java.lang.Object
	 */
	
	default public void m3() {
		System.out.println("In method 3");
	}
}
