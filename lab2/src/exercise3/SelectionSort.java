package exercise3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	
	
	
	public static void selectionSort(int[] numbers) {
		int length = numbers.length;
		
		for (int i = 0; i < length - 1; i++) {
			int min = numbers[i];
			int indexOfMin = i;
			for (int j = i +1; j < length; j++) {
				if(numbers[j] < min) {
					min = numbers[j];
					indexOfMin = j;
				}
					
			}
			swap(numbers, i, indexOfMin);
		}
		
			
		
	}

	private static void swap(int[] numbers, int x, int y) {
		int hold = numbers[x];
		numbers[x] = numbers[y];
		numbers[y] = hold;
		
	}
	
	
	
	
}
