// Given a string ‘S’, find the length of the Longest Palindromic Subsequence in it.

// Input: S = “GEEKSFORGEEKS”
// Output: 5
// Explanation: The longest palindromic subsequence we can get is of length 5. There are more than 1 palindromic subsequences of length 5, 
// for example: EEKEE, EESEE, EEFEE, …etc.

public class LPS {
    public static int lps(String S1,String S2,int n ,int m){
        int[][] dp =  new int[n+1][m+1];
        for(int i =0;i<=n;i++){
            for(int j =0;j<=m;j++){
                dp[i][j]=0;
            }
        }
       for(int i =1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(S1.charAt(i-1)==S2.charAt(j-1)){
                dp[i][j] = 1+dp[i-1][j-1];
            }else{
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String S1 = "agbcba";
       
        int n = S1.length();
        // for(int i = S1.length()-1;i>=0;i--){
        //     S2 =S2+S1.charAt(i);
        // }

        StringBuffer sb = new StringBuffer(S1);
        sb.reverse();
        String S2 = sb.toString();
        int m = S2.length();
        int result = lps(S1,S2,n,m);
        System.out.println(result);
    }
}
