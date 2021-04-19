package basics.test;

// How to remove duplicate characters from String?

public class RemoveDuplicateChars {
	
	public static void main(String[] args) {
		
		String str = "The Vampire Dairies";
		char arr[] = str.toCharArray();
		
		String res = "";
		for (char i: arr) {
			if (res.indexOf(i) == -1) {
				res+=i;
			}
		}
		System.out.println("The String after removing duplicates is "+res);
	}

}
