// Given two strings A and B, find if A is a subsequence of B.

// Example 1:

// Input:
// A = AXY 
// B = YADXCP
// Output: 0 
// Explanation: A is not a subsequence of B
// as 'Y' appears before 'A'.

public class checkforsubsequence {
    static boolean isSubSequence(String A, String B){
        int j =0;
        //String a ="";
        for(int i =0;i<B.length();i++){
            
                if(A.charAt(j) ==  B.charAt(i)){
                    //a+=B.charAt(i);
                    j++;
                }
                if(j==A.length()){
                    return true;
                }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String A = "gksrek";
   String B = "geeksforgeeks";
//String result = isSubSequence(A, B);
boolean result = isSubSequence(A, B);
System.out.println(result); 
    }
}
