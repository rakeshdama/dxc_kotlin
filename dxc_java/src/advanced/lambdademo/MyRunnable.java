package advanced.lambdademo;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("In Thread ");
		
	}
	// () -> System.out.println("In thread");
}
