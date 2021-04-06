package advanced.generics;

public class MyDemo<T> {
	
	T num;

	public MyDemo(T num) {
		//super();
		this.num = num;
	}
	
	public void show() {
		System.out.println(num);
		System.out.println("The type is "+num.getClass().getName());
	}

}
