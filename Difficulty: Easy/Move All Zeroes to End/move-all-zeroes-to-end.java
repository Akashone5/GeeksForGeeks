class Solution {
	void pushZerosToEnd(int[] arr) {
		// code here
		
		int low = 0;
		int high = arr.length - 1;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] != 0) {
				
				int temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;
				low++;
			}
		}
		
	}
}
