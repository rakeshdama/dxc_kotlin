package basics.test;

import java.util.Arrays;

//* Asked find biggest number and smallest number in an array (Java).

public class MaxMinArr {
	
	public static void main(String[] args) {
		
		int arr[]= {11,21,9,44,7,52,68,54,5,86};
		Arrays.sort(arr); 
		
		System.out.println("Minimum element in array is => "+ arr[0]);
		System.out.println("Maximum element in array is => "+arr[arr.length-1]);
	}
	
}
