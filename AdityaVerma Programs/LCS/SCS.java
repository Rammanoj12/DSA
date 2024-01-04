//Shortest common subsequence and PRINT SCS
// Given two strings X and Y of lengths m and n respectively, find the length of the smallest string which has both, X and Y as its sub-sequences.
// Note: X and Y can have both uppercase and lowercase letters.
// X = abcd, Y = xycd
// Output: 6
// Explanation: Shortest Common Supersequence
// would be abxycd which is of length 6 and
// has both the strings as its subsequences.
public class SCS {
    public static int scs(String S1,String S2,int n,int m){
        int[][] dp = new int[n+1][m+1];
         for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
         }
         for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
         }
         return dp[n][m];
         }

    // public static String printlcs(String S1,String S2,int n,int m){
    //        int[][] dp = new int[n+1][m+1];
    //      for(int i=0;i<=n;i++){
    //         for(int j=0;j<=m;j++){
    //             if(i==0||j==0){
    //                 dp[i][j]=0;
    //             }
              
    //      }
    //      for(int i=1;i<=n;i++){
    //         for(int j =1;j<=m;j++){
    //             if(S1.charAt(i-1)==S2.charAt(j-1)){
    //                 dp[i][j] = 1+dp[i-1][j-1];
    //             }else{
    //                 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    //             }
    //         }
    //      }
        

    
    //     String new_String ="",old="";
    //     int i =n;
    //     int j=m;
    //     int[][] dp1 = new int[n+1][m+1];
    //     while(i>0 && j>0){
    //         if(S1.charAt(i-1)== S2.charAt(j-1)){
    //             new_String+=S1.charAt(i-1);
                 
    //             i--;
    //             j--;
    //         }else if(dp1[i-1][j]>dp1[i][j-1]){
    //             new_String+=S2.charAt(j-1);
    //             j--;
    //         }else{
    //            new_String+=S1.charAt(i-1);
    //             i--;
    //         }
    //     }
    //     while (i > 0) 
    //     {
    //         new_String += (S1.charAt(i - 1));
    //         i--;
    //     }
 
    //     // // If X reaches its end, put remaining characters 
    //     // // of Y in the result string 
    //     while (j > 0)
    //     {
    //         new_String += (S2.charAt(j - 1));
    //         j--;
    //     }
 
//   for(int k =new_String.length()-1;k>=0;k--){
//         old=old+new_String.charAt(i);
//   }
//         return old;
//     }
// StringBuffer sb = new StringBuffer(new_String);
//        sb.reverse();
//        return sb.toString();
//     }

    public static void main(String[] args) {
        String S1 ="geke";
        String S2 ="eke";
        int n = S1.length();
        int m = S2.length();
       int result = m+n-scs(S1,S2,n,m);
        //String result1 = printlcs(S1,S2,n,m);
        System.out.println(result);
        //System.out.println(result1);
    }
}
