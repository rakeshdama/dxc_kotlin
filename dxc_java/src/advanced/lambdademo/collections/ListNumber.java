package advanced.lambdademo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(12);
		al.add(22);
		al.add(18);
		al.add(21);
		
		System.out.println(al);

		
		Collections.sort(al);
		
		System.out.println(al);
		
		Comparator<Integer> c = (o1,o2) -> (o1 < o2)? -1 : (o1 > o2) ? 1 : 0;
		Collections.sort(al,c);
		
		System.out.println(al);
		
	}
	
}

// comparator --- int compareTo(object o1, object o2)
// o1 to come before o2 then return a +ve no.
// o2 to come before o1 then return a -ve no.
// o1 == o2 then return 0