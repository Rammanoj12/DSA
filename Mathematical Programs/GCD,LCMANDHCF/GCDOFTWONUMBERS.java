// Given two numbers a and b, the task is to find the GCD of the two numbers.
// Java program to find GCD of two numbers
import java.util.*;

public class GCDOFTWONUMBERS {

	// Function to return gcd of a and b
	static int gcd(int a, int b)
	{
		// Find Minimum of a and b
		int result = Math.min(a, b);
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;
		}

		// Return gcd of a and b
		return result;
	}

	// Driver code
	public static void main(String[] args)
	{
		int a = 8, b = 12;
		System.out.print("GCD of " + a + " and " + b
						+ " is " + gcd(a, b));
	}
}



