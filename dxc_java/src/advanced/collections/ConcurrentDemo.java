package advanced.collections;

import java.util.Iterator;
import java.util.Vector;

public class ConcurrentDemo extends Thread{
	
	static Vector<String> arrayList = new Vector<String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		arrayList.add("Rakesh");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("e");
		arrayList.add("f");
		arrayList.add("g");
		arrayList.add("h");
		arrayList.add("i");
		
		
		ConcurrentDemo concurrentDemo = new ConcurrentDemo();
		concurrentDemo.start();
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
			
				Thread.sleep(5000);
			
		}
		
		System.out.println(arrayList);
	}
	

}

