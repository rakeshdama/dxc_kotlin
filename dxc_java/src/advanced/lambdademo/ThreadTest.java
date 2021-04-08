package advanced.lambdademo;

public class ThreadTest {
	
	public static void main(String[] args) {
		// MyRunnable r = new MyRunnable();
		Runnable r = () -> {
			for (int i=0;i<5;i++)
			System.out.println("In thread");
		};
		
		Thread t = new Thread(r);
		
		t.start();
		for (int i=0;i<5;i++)
			System.out.println("In main Thread");
		
	}

}