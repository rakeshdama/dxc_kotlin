package advanced.generics;

public class BoundedTest<T extends Number> {
	
	T a,b;
	
	
	
	public BoundedTest(T a, T b) {
		//super();
		this.a = a;
		this.b = b;
	}



	public void arthOp() {
		
		System.out.println(a);
		System.out.println(b);
	}

}
