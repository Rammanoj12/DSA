// Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some integer x. Return true if N is power of 2 else return false.

// Example 1:

// Input: 
// N = 8
// Output: 
// YES
// Explanation:
// 8 is equal to 2 raised to 3 (23 = 8).
public class powerof2 {
    public static boolean isPowerofTwo(long n){
        
//         if(n == 0){
//           return false;
//         }
// // The main logic for checking whether a number is a power of two is based on the fact that binary representations of powers of two have only one '1' bit. The expression (n & (n - 1)) is used to unset the rightmost '1' bit in the binary representation of n.

// // If the result is 0, it means that there was only one '1' bit in the original binary representation of n, indicating that n is a power of two.
// // If the result is not 0, it means that there was more than one '1' bit in the original binary representation of n, indicating that n is not a power of two
//         return (n & (n - 1)) == 0;
        
//     }
/// or
// int power =0;
// while((long)Math.pow(2,power)<=n){
//     if((long)Math.pow(2,power)==n){
//     return true;
// }
// power++;
// }
// return false;
      public static void main(String[] args) {
        long N = 16;
        System.out.println(isPowerofTwo(N));
      }
}
