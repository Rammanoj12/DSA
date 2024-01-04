// Given a number and its reverse. Find that number raised to the power of its own reverse.
// Note: As answers can be very large, print the result modulo 109 + 7.

// Example 1:

// Input:
// N = 2, R = 2
// Output: 4
// Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
public class powerofnumbers {
    static long power(int N,int R)
    {
        //Your code here
        if(R==0) return 1;
        if(R==1) return N;
        if(R%2 == 0){
            long halfPow = power(N, R/2);
            return (long)(halfPow*halfPow)%1000000007;
        } 
        else {
            return (long)(N*power(N,R-1))%1000000007;
        }
    }
    public static void main(String[] args) {
        int N = 2;
        int R = 2;
        System.out.println(power(N, R));
    }
    
}
