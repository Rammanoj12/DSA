//Sorted array
// Given an array arr[] of size N consisting of the first N natural numbers, the task is to find all the repeating and missing numbers \
//over the range [1, N] in the given array.

// Examples:

// Input: arr[] = {1, 1, 2, 3, 3, 5}
// Output: 
// Missing Numbers: [4, 6]
// Duplicate Numbers: [1, 3]
// Explanation:
// As 4 and 6 are not in arr[] Therefore they are missing and 1 is repeating two times and 3 is repeating two times so they are duplicate numbers. 

// Input: arr[] = {1, 2, 2, 2, 4, 5, 7}
// Output:
// Missing Numbers: [3, 6]
// Duplicate Numbers: [2]

import java.util.ArrayList;
import java.util.HashSet;

public class duplicateandmissingnumbersinagivenPermutation {

	// Function to find the duplicate and
	// the missing elements over the range
	// [1, N]
	static void findElements(int arr[], int N) {
		int i = 0;

		// Stores the missing and duplicate
		// numbers in the array arr[]
		ArrayList<Integer> missing = new ArrayList<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();

		// Traverse the given array arr[]
		while (i != N) {
			// Check if the current element
			// is not same as the element at
			// index arr[i] - 1, then swap
			if (arr[i] != arr[arr[i] - 1]) {
				int temp = arr[i];
				arr[i] = arr[arr[i] - 1];
				arr[temp - 1] = temp;
			}

			// Otherwise, increment the index
			else {
				i++;
			}
		}

		// Traverse the array again
		for (i = 0; i < N; i++) {

			// If the element is not at its
			// correct position
			if (arr[i] != i + 1) {

				// Stores the missing and the
				// duplicate elements
				missing.add(i + 1);
				duplicate.add(arr[i]);
			}
		}

		// Print the Missing Number
		// System.out.print("Missing Numbers: ");
		// for (Integer itr : missing)
		// 	System.out.print(itr + " ");

		// // Print the Duplicate Number
		// System.out.print("\nDuplicate Numbers: ");
		// for (Integer itr : duplicate)
		// 	System.out.print(itr + " ");
        System.out.println(missing);
        System.out.println(duplicate);
	}

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 1, 2, 2, 2, 4, 5, 7 };
		int N = arr.length;
		findElements(arr, N);
	}

}

// This code is contributed by gfgking.
