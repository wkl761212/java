package exercise2;


public class BinarySearch {
	
	
	public static int binarySearch(int[] numbers, int targetNumber ){
		int low = 0;
		int high = numbers.length - 1;
		
		while (low <= high) {
			int midposition = (low + high) / 2;
			int midNumber = numbers[midposition];
			if (targetNumber == midNumber) {
				return midposition;
			}else if (targetNumber > midNumber){
				low = midposition + 1;
			}else {
				high = midposition - 1;
			}
		}
		
		return -1;
	}
}
