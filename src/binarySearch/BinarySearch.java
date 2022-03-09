package binarySearch;

import java.util.Arrays;

public class BinarySearch {
	
	// binary search - Search algorithm that finds the position of a target value within
	//				   a sorted array. Half of the array is eliminated during each step

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[1000000];
		int target= 762359;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		int index = binarySearch(array, target);
		
		if(index == -1) {
			System.out.println("Number not found");
		}else {
			System.out.println("Number found at index: " + index);
		}

	}

	private static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int middle = low + (high - low)/2;
			int value = array[middle];
			
			System.out.println("middle: " + value);
			
			if(value < target) low = middle + 1;
			else if(value > target) high = middle - 1;
			else return middle;
			
			
		}
		return -1;
	}

}
