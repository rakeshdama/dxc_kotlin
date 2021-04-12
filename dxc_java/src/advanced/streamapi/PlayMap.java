package advanced.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PlayMap {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(30);
		marks.add(15);
		marks.add(12);
		marks.add(21);
		System.out.println(marks);
		
		List<Integer> updatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		
		List<Integer> evenNumbers = marks.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		long noStudentsMarksLessFifteen = marks.stream().filter(i -> i<15).count();
		System.out.println(noStudentsMarksLessFifteen);
		
		List<Integer> sortList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList);
		
	}

}
