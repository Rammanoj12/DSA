// Given two strings ‘str1’ and ‘str2’ of size m and n respectively. The task is to remove/delete and insert the minimum number of characters from/in str1 to transform it into str2. It could be possible that the same character needs to be removed/deleted from one point of str1 and inserted at some another point.

// Example 1: 

// Input : 
// str1 = "heap", str2 = "pea" 
// Output : 
// Minimum Deletion = 2 and
// Minimum Insertion = 1




public class minimumInsertionAndDeletion {
    public static int mad(String S1,String S2,int n,int m){
        int[][] dp = new int[n+1][m+1];
        for(int i =0;i<=n;i++){
            for(int j =0;j<=m;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
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
        String S1 ="manoj";
        String S2 ="ammu";
        int n = S1.length();
        int m = S2.length();
       int insertion = m-mad(S1,S2,n,m);
       int deletion = n-mad(S1,S2,n,m);
       System.out.println("The minimum insertion's are :"+insertion);
       System.out.println("The minimum deletion's are :"+deletion);
    }
}
