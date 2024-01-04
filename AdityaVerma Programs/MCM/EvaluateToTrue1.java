// Given a boolean expression with the following symbols. 

// Symbols
//     'T' ---> true 
//     'F' ---> false 
// And following operators filled between symbols 
// Operators
//     &   ---> boolean AND
//     |   ---> boolean OR
//     ^   ---> boolean XOR 


// Input: symbol[]    = {T, F, T}
//        operator[]  = {^, &}
// Output: 2
// The given expression is "T ^ F & T", it evaluates true
// in two ways "((T ^ F) & T)" and "(T ^ (F & T))"
//////////////////////////////////////////////////
///////////////////OR////////////////////////////

// Problem Statement: Given an expression, A, with operands and operators (OR, AND, XOR), 
// in how many ways can you evaluate the expression to be true, by grouping it in different ways?
// Example 1:
// Input: expression = “T|T&F”
// Output: 1
// Explanation: The only way to get the result as true is:
// (T) | (T&F) = T|F = T 

public class EvaluateToTrue1 {
    static int solve(String s, int i, int j,int[][][] dp, int isTrue) {
        int ans = 0;
        if (i > j) {
            return 0;
        }
         if (dp[i][j][isTrue] != -1) {
            return dp[i][j][isTrue];
        }
        if (i == j) {
            if (isTrue == 1) {
                return s.charAt(i) == 'T' ? 1 : 0;
            } else {
                return s.charAt(i) == 'F' ? 1 : 0;
            }
        }
       
        for (int k = i + 1; k < j; k += 2) {
            int lt = solve(s, i, k - 1,dp, 1);
            int lf = solve(s, i, k - 1,dp, 0);
            int rt = solve(s, k + 1, j,dp, 1);
            int rf = solve(s, k + 1, j,dp, 0);
            if (s.charAt(k) == '&') {
                if (isTrue == 1) {
                    ans += lt * rt;
                } else {
                    ans += lt * rf + lf * rt + lf * rf;
                }
            } else if (s.charAt(k) == '|') {
                if (isTrue == 1) {
                    ans += lt * rt + lt * rf + lf * rt;
                } else {
                    ans += lf * rf;
                }
            } else if (s.charAt(k) == '^') {
                if (isTrue == 1) {
                    ans += lt * rf + lf * rt;
                } else {
                    ans += lt * rt + lf * rf;
                }
            }
        }
       dp[i][j][isTrue] = ans;
        return ans;
    }

    public static int countWays(String s) {
        int n = s.length();
        int[][][] dp = new int[n][n][2];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < 2; c++) {
                    dp[a][b][c] = -1;
                }
            }
        }
        return solve(s, 0, n - 1,dp, 1);
    }

    public static void main(String[] args) {
        // String s = "F|T^F";
        // int ways = countWays(s);
        // System.out.println("Number of ways to parenthesize the expression to make it true: " + ways);

        String s ="T|T&F";
        int i=0;
       int j =s.length()-1;
       
       int result = countWays(s);
     System.out.println("Number of ways to parenthesize the expression to make it true: "+result);

        
        // String symbols ="TTFT";
        // String operators ="&|^";
        // StringBuilder sb = new StringBuilder();
        // int E =0;
        // for(int a=0;a<sb.length();a++){
        //     sb.append(symbols.charAt(a));
        //     a++;
        //     if(E<operators.length()){
        //         sb.append(operators.charAt(E));
        //          E++;
        //     }
        // }
        
        // String newString= sb.toString();
        // int n = newString.length();
        //   int j =n-1;
        // int result = countWays(newString);
        //  System.out.println(result);
    }
}
