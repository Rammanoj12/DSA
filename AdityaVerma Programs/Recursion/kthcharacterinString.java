// Given a decimal number m. Convert it into a binary string and apply n iterations, in each iteration 0 becomes 01, and 1 becomes 10. Find the kth (1-indexing) character in the string after the nth iteration.

// Example 1:

// Input: m = 5, n = 2, k = 5
// output: 0
// Explanation: Binary representation of m 
// is "101", after one iteration binary 
// representation will be "100110", and after 
// second iteration binary representation 
// will be "100101101001". 

// Input: m = 5, n = 2, k = 1
// output: 1
// Explanation: Binary representation of m 
// is "101", after one iteration binary 
// representation will be "100110", and after 
// second iteration binary representation
// will be "100101101001". 
public class kthcharacterinString {
    static char kthCharacter(int m, int n, int k) {
        StringBuilder res = new StringBuilder(Integer.toBinaryString(m));
        int l = res.length();
        while(n!=0){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<l;i++){
                if(res.charAt(i) == '0'){
                    sb.append("01");
                }
                else{
                    sb.append("10");
                }
            }
            res = sb;
            l = res.length();
            n--;
        }
        return res.charAt(k-1);
    }
    public static void main(String[] args) {
        int m = 5;
        int n =2;
        int k =1;
        char result = kthCharacter(m,n,k);
        
        System.out.println(result);
    }
}
