package bubbleSort;

public class BubbleSort {

	// bubble sort - pairs of adjacent elements are compared and swapped if they are not in order
	// 				 Quadratic time O(n ^ 2) 
	//               Okay for small data sets 
	//               Terrible for large data sets
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12, 6, 7, 3, 5, 2, 13, 8, 14, 10, 1, 4, 9, 11, 15};
		
		bubbleSort(array);
		
		for (int i : array) {
			System.out.print(i);
		}
		
	}

	private static void bubbleSort(int[] array) {
		int count = 0;
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				System.out.println("Times Through: " + count++);
				if(array[j] > array[j + 1]) {		
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
					
			}
	
		}
	
	}
	
}
