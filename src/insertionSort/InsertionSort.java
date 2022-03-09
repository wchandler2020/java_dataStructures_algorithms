package insertionSort;

public class InsertionSort {
	
	// insertionSort = after comparing elements to the left, it shifts elements to the right
	//                 to make to insert a value

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9 , 4, 2, 7, 1, 8, 6, 3, 5};
		insertionSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}
		
		
	}

	private static void insertionSort(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			
			int j = i - 1;
			
			while(j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
				
			}
			array[j + 1] = temp;
		}
		
	}

}
