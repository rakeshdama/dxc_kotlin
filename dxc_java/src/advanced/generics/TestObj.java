package advanced.generics;

public class TestObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		GenericDemo2<Integer> g1 = new GenericDemo2<Integer>(18);
		g1.show();
		System.out.println(g1.getOb());
		
		BoundedTest<Integer> boundedTest = new BoundedTest<Integer>(10,20);
		boundedTest.arthOp();
		*/
		
		MyDemo<String> myDemo = new MyDemo<String>("Rakesh");
		myDemo.num = "Dama";
		myDemo.show();
		
		GenericDemo2<?> g3 = new GenericDemo2<Integer>(21);
		g3.show();
		System.out.println(g3.getOb());
		
		MyDemo<?> md = new MyDemo<Integer>(86);
		md.show();
	}

}
