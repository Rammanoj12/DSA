public class minimumdifferenceelementinasortedarray {

	private static int minimumDifferenceElementSortedArray(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		int minDifference;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == key) {
				return arr[mid];
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		if (Math.abs(arr[start] - key) > Math.abs(arr[end] - key)) {
			minDifference = Math.abs(arr[end] - key);
		} else {
			minDifference = Math.abs(arr[start] - key);
		}
       

		return minDifference;

	}

	public static void main(String[] args) {

		int[] arr = {1,2,3,4 };
		int key = 3;

		int minimumDifferenceElementSortedArray = minimumDifferenceElementSortedArray(arr, key);

		System.out.println("minimum difference of key " + key + " is " + minimumDifferenceElementSortedArray);
	}

}
