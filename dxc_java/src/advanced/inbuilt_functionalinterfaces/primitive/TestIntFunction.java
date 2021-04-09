package advanced.inbuilt_functionalinterfaces.primitive;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class TestIntFunction {

	public static void main(String[] args) {
		
		IntFunction<Integer> ifunc = i -> i * i;
		System.out.println(ifunc.apply(9));
		
		ToIntFunction<String> tif = s -> s.length();
		System.out.println(tif.applyAsInt("Rakesh Dama"));
		
	}
	
}
