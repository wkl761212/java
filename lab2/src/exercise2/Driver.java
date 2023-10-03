package exercise2;

import java.util.Random;

public class Driver {

	
	public static void main (String[] args) {
		
		int[] ints = {1,3,9,42,66,87};
		
		System.out.println("Target Number 66 is at index: " + BinarySearch.binarySearch(ints, 66));
		System.out.println(BinarySearch.binarySearch(ints, 77));
	}
}
