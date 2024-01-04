//LONGEST COMMON SUBSTRING
// Given two strings ‘X’ and ‘Y’, find the length of the longest common substring. 

// Examples : 

// Input : X = “GeeksforGeeks”, y = “GeeksQuiz” 
// Output : 5 
// Explanation:
// The longest common substring is “Geeks” and is of length 5.
//Memoization 
// public class longestcommonSubstring{
//     public static int lcs(String S1,String S2,int n,int m,int[][] dp){
//        int max = Integer.MIN_VALUE;
     
//         if(n==0||m==0){
//             return 0;
//         }
//         if(dp[n][m]!=-1){
//             return dp[n][m];
//         }
//         if(S1.charAt(n-1)==S2.charAt(m-1)){
//               dp[n][m]= 1+lcs(S1, S2, n-1, m-1, dp);
//               return max= Math.max(max,dp[n][m]);
//         }else{
            
//              return dp[n][m]=0;
            
//         }
//     }
//     public static void main(String[] args) {
//          String S1 ="“GeeksforGeeks”";
//         String S2 ="“GeeksQuiz”";
//         int n = S1.length();
//         int m = S2.length();
        
//         int[][] dp = new int[n+1][m+1];
//         for(int i =0;i<=n;i++){
//             for(int j =0;j<=m;j++){
//                 dp[i][j] =-1;
//             }
//         }
//         int res=lcs(S1,S2,n,m,dp);
//         System.out.println(res);
        
//     }
// }

























//////////////////////////////////////////////////////////////////////////
//Tabulation method
public class longestcommonSubstring {
    public static int lcs(String S1,String S2,int n,int m){
        int[][] dp = new int[n+1][m+1];
        int max = 0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
          for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                    max = Math.max(max,dp[i][j]);
                }else{
                    dp[i][j] =0;
                }
            }
          }
        return dp[n][m]=max;

    }
    public static void main(String[] args) {
        String S1 ="geke";
        String S2 ="eke";
        int n = S1.length();
        int m = S2.length();
        System.out.println(lcs(S1,S2,n,m));
    }
}
