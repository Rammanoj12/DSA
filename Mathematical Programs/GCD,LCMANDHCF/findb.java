// Given a number A and L.C.M and H.C.F. The task is to determine the other number B.

// Examples: 

// Input: A = 10, Lcm = 10, Hcf = 50.
// Output: B = 50

// Input: A = 5, Lcm = 25, Hcf = 4.
// Output: B = 20
// Java program to find other number from given 
// HCF and LCM 
import java.util.*;

public class findb{

// Function that will calculates 
// the zeroes at the end 
static int otherNumber(int A, int Lcm, int Hcf) 
{ 
	return (Lcm * Hcf) / A; 
} 

// Driver code 
public static void main(String args[])
{ 
	int A = 8, Lcm = 8, Hcf = 1; 

	// Calling function. 
	int result = otherNumber(A, Lcm, Hcf); 

	System.out.println("B = "+ result); 

}
} 
