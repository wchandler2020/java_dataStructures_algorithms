package linearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 41, 66, 23, 99, 87, 77, 63, 78, 13, 12, 43, 31, 39, 56, 92, 74, 68};
		System.out.println(findNum(nums, 77));
		
	}

	private static int findNum(int[] nums, int value) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
