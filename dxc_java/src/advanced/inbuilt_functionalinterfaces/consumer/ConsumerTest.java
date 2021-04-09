package advanced.inbuilt_functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

import advanced.inbuilt_functionalinterfaces.function.Student;
import advanced.inbuilt_functionalinterfaces.function.StudentTest;

public class ConsumerTest {

	static ArrayList<Student> students = StudentTest.generateMarks();
	
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> System.out.println(s.name);
		
		Predicate<Student> p = s -> s.total_marks >= 700;
		
		 for (Student s : students) {
			 if (p.test(s))
				 c.accept(s);
		 }
	}
	
	
}
