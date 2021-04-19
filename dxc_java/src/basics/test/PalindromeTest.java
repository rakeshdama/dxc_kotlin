package basics.test;

//* How to check if String and given number is Palindrome? 

public class PalindromeTest {

	public static void main(String[] args) {

		StringBuilder str1 = new StringBuilder("MADAM");
		StringBuilder str2 = str1.reverse();

		if(str1.equals(str2)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}