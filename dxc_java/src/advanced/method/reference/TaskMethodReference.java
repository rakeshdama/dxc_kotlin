package advanced.method.reference;

public class TaskMethodReference {
	
	public static void main(String[] args) {
		
		Task t = TaskMethodReference::T1;
		t.add(10, 20);
	}
	
	public static void T1(int a, int b) {
		System.out.println(a+b);
	}

}
