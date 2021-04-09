package advanced.inbuilt_functionalinterfaces.biparams;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import advanced.inbuilt_functionalinterfaces.function.Student;
import advanced.inbuilt_functionalinterfaces.function.StudentTest;


public class BiConsumerTest {

	public static void main(String[] args) {
		
		ArrayList<Student> students = StudentTest.generateMarks();
		
		BiConsumer<Student, Integer> bic = (i, j) -> i.total_marks += 10;
		
		for (Student s : students) {
			bic.accept(s, 10);
			System.out.println(s.name+" "+s.total_marks);
		}
		
		
		
	}
	
}
