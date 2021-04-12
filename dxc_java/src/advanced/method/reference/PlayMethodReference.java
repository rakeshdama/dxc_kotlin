package advanced.method.reference;

public class PlayMethodReference {

	public static void main(String[] args) {

		//		Runnable r = () -> {
		//			for (int i = 0; i<10 ;i++)
		//			{
		//				System.out.println("In child");
		//			}
		//			
		//		};
		//		Thread t = new Thread(r);
		//		t.start();
		//		
		//	}
		Runnable r = PlayMethodReference::m1;
		Thread t1 = new Thread(r);
		t1.start();

		for(int i=0;i<10;i++) {
			System.out.println("In main ");
		}
	}


	public static void m1() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("In from m1");
		}
	}
}