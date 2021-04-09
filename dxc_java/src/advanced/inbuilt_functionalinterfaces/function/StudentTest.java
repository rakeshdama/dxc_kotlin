package advanced.inbuilt_functionalinterfaces.function;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {

	static ArrayList<Student> students;

	public static void main(String[] args) {
		generateMarks();

		Function<Student, String> f = s ->
		{
			if (s.total_marks > 800) return "Distinction" ;
			else if (s.total_marks >= 500 ) return "First Class" ;
			else return "Failed";
		};

		for (Student s: students) {
			System.out.println(s.name+" got "+f.apply(s));
		}
	}
	static void generateMarks() {
		students = new ArrayList<Student>();
		students.add(new Student("Rakesh" ,900));
		students.add(new Student("Sridhar" ,800));
		students.add(new Student("Doremon" ,500));
	}
}