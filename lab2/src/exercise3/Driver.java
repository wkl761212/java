package exercise3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);		
		}	
		System.out.println("Original Array: " + Arrays.toString(numbers));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Selection Sort");
        int choice = scanner.nextInt();
        switch(choice) {
        	case 1:
        		SelectionSort.selectionSort(numbers);
        		break;
        	default: 
        		System.out.println("Invalid choice");
        		return;
        }
		System.out.println("Sorted Array: " + Arrays.toString(numbers));
	}
}
