// Given an array of strings arr[], the task is to sort the array of strings according to the frequency of each string, in ascending order. If two elements have the same frequency, then they are sorted into lexicographical order.

// Examples: 

// Input: arr[] = {“Geeks”, “for”, “Geeks”} 
// Output: {“for”, “Geeks”} 
// Explanation: 
// As the string “Geeks” has a frequency of 2 in the given array, 
// Hence, the position of the string “Geeks” will be 2
/*package whatever //do not write package name here */
import java.util.*;

public class frequencysortstring {

	static class Pair<K, V> {
		K key;
		V val;

		Pair(K k, V v)
		{
			key = k;
			val = v;
		}
	}

	// Function to sort the array of strings
	// by its frequency in the array
	static void printArraystring(String str[], int n)
	{
		HashMap<String, Integer> m = new HashMap<>();

		// Loop to store the frequency
		// of a string in a hash-map
		for (int i = 0; i < n; i++) {
			m.put(str[i], m.getOrDefault(str[i], 0) + 1);
		}

		// Iterator for the map
		List<Pair<Integer, String> > vec
			= new ArrayList<>();

		// Loop to store the frequency and
		// string in a vector
		for (String st : m.keySet()) {
			vec.add(new Pair(m.get(st), st));
		}

		// Sort the string
		// using custom comparator
		Collections.sort(vec, (x, y) -> {
		
			// Condition to check if the
			// frequency of the string is less
			if (x.key < y.key) {
				return -1;
			}

			// Condition to check if the
			// frequency of the string is greater
			else if (x.key > y.key) {
				return 1;
			}

			// Condition when frequency of
			// the strings is equal
			else {

				// Condition to check if the
				// first string is lexicographically
				// smaller than second string
				if (x.val.compareTo(y.val) < 0) {
					return -1;
				}
				else {
					return 1;
				}
			}
		});

		// Loop to print the sorted vector
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i).val + ", ");
		}
	}

	public static void main(String[] args)
	{
		String arr[]
			= { "Geeks", "for", "Geeks", "for", "arc" };
		int n = arr.length;
	
		// Function to perform sorting
		printArraystring(arr, n);
	}
}

// This code is contributed by aadityaburujwale.
