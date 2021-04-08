package advanced.lambdademo.defaultstatic.inheritance;

public interface Left {
	
	public default void m1() {
		System.out.println("left interface");
	}

}
