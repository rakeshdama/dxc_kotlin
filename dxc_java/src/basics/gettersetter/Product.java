package basics.gettersetter;

public class Product {
	
	protected String name; // here it is provate i.e only accessible within class
	
	void setName(String name) {
		// here it is used to set the value
		
		// consider if both local and instance varaibles has same then we can use this(keyword) to call instance varaible
		// like this this.instance_var = local_var
		
		this.name = name;
		
	}
	
	String getName() {
		//here it is used to return (get ) the value to main
		
		return name;
	}


}