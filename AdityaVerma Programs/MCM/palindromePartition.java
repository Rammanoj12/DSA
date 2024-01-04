// Given a string str, a partitioning of the string is a palindrome partitioning if every sub-string of the partition is a palindrome, 
//the task is to find the minimum number of cuts needed for palindrome partitioning of the given string.




// Examples :  

// Input: str = “geek” 
// Output: 2 
// Explanation: We need to make minimum 2 cuts, i.e., “g ee k”

// Input: str = "ababbbabbababa"
// Output: 3
// Explaination: After 3 partitioning substrings 
// are "a", "babbbab", "b", "ababa".
// Example 2:

// Input: str = "aaabba"
// Output: 1
// Explaination: The substrings after 1
// partitioning are "aa" and "abba".
public class palindromePartition {
    static int name = 0;

    // static void printPartition(int i, int j, String s) {
    //     if (i == j) {
    //         System.out.print(s.charAt(i));
    //     } else {
    //         System.out.print("(");
    //         printPartition(i, j-1, s);
    //         //System.out.print("*");
    //         printPartition(i+1, j, s);
    //         System.out.print(")");
    //     }
    // }

    static boolean isPalindrome(String s, int i, int j) {
        if(i==j){
            return true;
        }
        if(i>j){
            return true;
        }
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int minpalindrome(String s, int n, int i, int j, int[][] dp) {
       
        if (i >= j) {
            return 0;
        }
        if (isPalindrome(s, i, j)) {
            return 0;
        }
          if (dp[i][j] != -1) {
            return dp[i][j];
        }
       
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost = 1;
            int first =0,second=0;
            if(dp[i][k]!=-1){
                first = dp[i][k];
            }else{
                first = minpalindrome(s, n, i, k, dp);
                dp[i][k]= first;
            }
            
             if(dp[k+1][j]!=-1){
                second = dp[k+1][j];
            }else{
                second = minpalindrome(s, n, k+1, j, dp);
                dp[k+1][j]= second;
            }
            int tempAns = first+ second+ cost;
            if (tempAns <min) {
                min = tempAns;
            }
        }
        return dp[i][j] = min;
    }

    public static void main(String[] args) {
        String s = "aaabba";
        int n = s.length();
        int i = 0;
        int j = n - 1;
        int[][] dp = new int[n][n];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                dp[a][b] = -1;
            }
        }

        int result = minpalindrome(s, n, i, j, dp);
        System.out.println(result);
        // System.out.print("The palindrome partition: ");
        // printPartition(i, j, s);
    }
}
