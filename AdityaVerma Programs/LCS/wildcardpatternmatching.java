// Given two strings 'str' and a wildcard pattern 'pattern' of length N and M respectively,  You have to print '1' if the wildcard pattern is matched with str else print '0' .

// The wildcard pattern can include the characters ‘?’ and ‘*’
// ‘?’ – matches any single character
// ‘*’ – Matches any sequence of characters (including the empty sequence)

// Note: The matching should cover the entire str (not partial str).

 

// Example 1:

// Input:
// pattern = "ba*a?"
// str = "baaabab"
// Output: 1
// Explanation: replace '*' with "aab" and 
// '?' with 'b'.

public class wildcardpatternmatching {

   static int wildCard(String s1,String s2)
    {
        int n = s1.length();
        int m = s2.length();
        //int min = Integer.MAX_VALUE;
        int[][] t= new int[n+1][m+1];
        t[0][0] =1;
        for(int i =1; i<m+1; i++){
            t[0][i] =0;
        }
        for(int i =1; i<n+1; i++){
            if(s1.charAt(i-1) == '*'){
                t[i][0] = t[i-1][0];
            } else{
               t[i][0] = 0; 
            } 
        }
        for(int i =1; i<n+1; i++){
            for(int j =1; j<m+1; j++){
                if(s1.charAt(i-1)== '?'){
                    t[i][j] = t[i-1][j-1];
                } 
                else if(s1.charAt(i-1)=='*'){
                    t[i][j] = (t[i-1][j] + t[i][j-1]);
                    //  if(t[i][j]>1){
                    //      t[i][j] = 1;
                    //  }
                }else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1];
                } else{
                    t[i][j] = 0;
                }
            }
        }
        return t[n][m];
        
    }    
    public static void main(String[] args) {
    //    String pattern = "a*ab";
    //    String  str = "baaabab";
      String pattern = "****a***b**c";
       String  str = "dsfsabc";
       int result = wildCard(pattern,str);
       System.out.println(result);
    }
}
