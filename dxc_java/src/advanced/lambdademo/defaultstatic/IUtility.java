package advanced.lambdademo.defaultstatic;

public interface IUtility {
	
	public static boolean IsEligible(int n) {
		return n>=18 ? true : false;
	}

}
