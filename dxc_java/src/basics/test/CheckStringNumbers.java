package basics.test;

// * How to check if a String contains only digits?

public class CheckStringNumbers {

	public static void main(String[] args) {
		
		String mobileNo1 = "8179e";
		String mobileNo2 = "79897";
		
		validate(mobileNo1);
		validate(mobileNo2);
		
	}

	private static void validate(String mobileNo) {
		try {
		Integer i = Integer.parseInt(mobileNo);
		System.out.println(i);
		}
		catch (Exception e) {
			System.out.println("this is invalid mobile number");
		}
	}
	
}
