package basics.gettersetter;

public class Product {
	
	protected String name; // here it is provate i.e only accessible within class
	
	void setName(String newName) {
		// here it is used to set the value
		
		name = newName;
		
	}
	
	String getName() {
		//here it is used to return (get ) the value to main
		
		return name;
	}


}