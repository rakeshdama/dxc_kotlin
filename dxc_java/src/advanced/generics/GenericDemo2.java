package advanced.generics;


public class GenericDemo2<T> {
	T ob;
	
	public GenericDemo2(T ob) {
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("The type of this class is "+ob.getClass().getName());
	}
	
	public T getOb() {
		return ob;
	}

}