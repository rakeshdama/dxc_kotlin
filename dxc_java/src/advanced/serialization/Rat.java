package advanced.serialization;

import java.io.Serializable;

public class Rat implements Serializable{
	
	transient int a = 18;
	
	Cat cat = new Cat();
	

}
