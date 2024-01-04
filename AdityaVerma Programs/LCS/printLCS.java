// Print the longest common substring
// Given two strings ‘X’ and ‘Y’, print the length of the longest common substring. If two or more substrings have the same value for the longest common substring, then print any one of them.

// Examples: 

// Input :  X = "GeeksforGeeks", 
//          Y = "GeeksQuiz"
// Output : Geeks

public class printLCS {
    public static String printlcs(String S1,String S2,int n,int m){
        String newString ="";
        String old ="";
        int[][] dp = new int[n+1][m+1];
        int a =n;
        int b=m;

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
        
        while(a>0 && b>0){
            if(S1.charAt(a-1)==S2.charAt(b-1)){
                newString += S1.charAt(a-1);
                a--;
                b--;
            }else if(dp[a][b-1]>dp[a-1][b]){
               
                b--;
            }else{
                
                a--;
            }
        }
        // while (a > 0) 
        // {
        //     newString += (S1.charAt(a - 1));
        //     a--;
        // }
 
        // // If X reaches its end, put remaining characters 
        // // of Y in the result string 
        // while (b > 0)
        // {
        //     newString += (S2.charAt(b - 1));
        //     b--;
        // }
//      for(int k = newString.length()-1;k>=0;k--){
//         old = old + newString.charAt(k);
//     }
//  return old;
       StringBuffer sb = new StringBuffer(newString);
       sb.reverse();
       return sb.toString();
    }
    public static void main(String[] args) {
        String S1 ="abcdef";
        String S2 ="abcegh";
        int n = S1.length();
        int m = S2.length();
        String result = printlcs(S1,S2,n,m);
        System.out.println(result);
    }
    
}
