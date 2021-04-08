package basics.gettersetter;

public class Shop {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = p2; // here p2 and p3 are referencing to same object location.
		
		p1.setName("Tea");
		p2.setName("Chicken");
		p3.setName("Biriyani");
		
		// we can make use of getters and setters for private variables.
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
	}
	
}