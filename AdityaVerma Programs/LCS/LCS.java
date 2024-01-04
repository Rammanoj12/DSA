///LONGEST COMMON SUBSEQUENCE

// Given two strings, S1 and S2, the task is to find the length of the Longest Common Subsequence, i.e. longest subsequence present in both of the strings. 

// Input: S1 = “AGGTAB”, S2 = “GXTXAYB”
// Output: 4
// Explanation: The longest subsequence which is present in both strings is “GTAB”.

//Recursion --O(2^N)--TIME;
 //           -- O(N) --Space
///////////////////////////////////////////////////////////
// public class LCS{
//     public static int  lcs(String S1,String S2,int n,int m){
//         if(n==0||m==0){
//             return 0;
//         }
//         if(S1.charAt(n-1)==S2.charAt(m-1)){
//             return 1+lcs(S1,S2,n-1,m-1);
//         }else{
//             return Math.max(lcs(S1,S2,n-1,m),
//             lcs(S1,S2,n,m-1));
//         }
//     }
//     public static void main(String[] args) {
//          String S1 ="abcdefgh";
//         String S2 ="abcdfh";
//         int n = S1.length();
//         int m = S2.length();
//         System.out.println(lcs(S1,S2,n,m));
//     }
// }
////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////
//Memoization-- O(n*m)--time
// O(n*m)+O(2^n)--space

// public class LCS{
//     public static int lcs(String S1,String S2,int n,int m,int[][] dp){
//         if(n==0||m==0){
//             return 0;
//         }
//         if(dp[n][m]!=-1){
//             return dp[n][m];
//         }
//         if(S1.charAt(n-1)==S2.charAt(m-1)){
//             return 1+lcs(S1,S2,n-1,m-1,dp);
//         }else{
//             return Math.max(lcs(S1, S2, n-1, m, dp),lcs(S1, S2, n, m-1, dp));
//         }
//     }
//     public static void main(String[] args) {
//         String S1 ="abcdefgh";
//         String S2 ="abcdfh";
//         int n = S1.length();
//         int m = S2.length();
//         int[][] dp = new int[n+1][m+1];
//        for(int i =0;i<=n;i++){
//         for(int j =0;j<=m;j++){
//             dp[i][j]=-1;
//         }
//        }
//         System.out.println(lcs(S1,S2,n,m,dp));
//     }
// }
//////////////////////////////////////////////////////////////////






//////////////////////////////////////////////////////////////////
//Tabulation method
public class LCS{
   public static int lcs(String S1,String S2,int n,int m){
    int[][] dp = new int[n+1][m+1];
    for(int i =0;i<=n;i++){
        for(int j =0;j<=m;j++){
            if(i==0||j==0){
                dp[i][j] =0;
            }
        }
    }
    for(int i=1;i<=n;i++){
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
        String S1 ="AGGTAB";
        String S2 ="GXTXAYB";
        int n = S1.length();
        int m = S2.length();
        System.out.println(lcs(S1,S2,n,m));
    }
}
///////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////
//////Single dp array where space can be optimised but time is same
// public class LCS {
//     public static void main(String[] args) {

//         
        
//     //     static int lcs(int x, int y, String str1, String str2)
//     // {
        
//     //    int[] dp = new int[y + 1];

//     // for (int i = 1; i <= x; i++) {
//     //     int prev = 0; 

//     //     for (int j = 1; j <= y; j++) {
//     //         int temp = dp[j];  

//     //         if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                
//     //             dp[j] = prev + 1;
//     //         } else {
                
//     //             dp[j] = Math.max(dp[j], dp[j - 1]);
//     //         }

//     //         prev = temp;  
//     //     }
//     // }

    
//     // return dp[y];


//     // }
//     }
// }
