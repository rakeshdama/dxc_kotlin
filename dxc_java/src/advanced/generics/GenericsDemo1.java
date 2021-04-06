package advanced.generics;

import java.util.ArrayList;
import java.util.List;


public class GenericsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students = new String[3];
		students[0] = "Rakesh";
		students[1] = "18";
		
		String name = students[0];
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Rakesh");
		
		//studentList.add(new Integer(18));
		
		// Polymorphism is not applicable for parameter type and is applicable for base type.
		
		List<String> student = new ArrayList<String>();
		
		student.add(name);
		
		System.out.println(student.get(0));
		
		System.out.println(studentList);
		
		//String name1 = (String) studentList.get(1);
		//System.out.println(name1);
	}

}
