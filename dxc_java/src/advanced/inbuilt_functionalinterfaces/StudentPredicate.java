package advanced.inbuilt_functionalinterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentPredicate {
	
	static ArrayList<Student> students;
	
	public static void main(String[] args) {
		
		generateMarks();
		
		Predicate<Student> p = (s) -> (s.m1 + s.m2 + s.m3) > 75 ;
		for(Student s: students) {
		System.out.println(s.name+" has "+(p.test(s) ? "Passed": "Failed"));
		}
		
	}
	
	static void generateMarks() {
		students = new ArrayList<Student>();
		
		students.add(new Student("Rakesh",50, 50, 50));
		students.add(new Student("Doremon", 20, 30, 20));
		
	}

}
