import java.util.ArrayList;
import java.util.Arrays;

// public class subsequenceAndPermuatations {
//     public static void permuationstring(String S, String permutation){

        
//         if(S.length() ==0 ){
//             System.out.println(permutation);
//         }
//         for(int i =0;i<S.length();i++){
//            char currChar = S.charAt(i);
//            String newStr = S.substring(0, i)+S.substring(i+1);
//            permuationstring(newStr, permutation+currChar);
//         }
//         ///Converting string to arraylist 
//         //First, convert it to string array
//         //Then in arraylist take Arrays.asList(arr_name)
//         //Print the list
//         //  String[] array = permutation.split("");
//         // ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
//         // System.out.print(list+" ");
        
       
//     }
//     public static void main(String[] args) {
//         String S ="ABC";
//         String permutation ="";
//         permuationstring(S,permutation);
//     }
// }


// public class subsequenceAndPermuatations {
//     //static int count =0;
//     static void subpermutations(String str,String perm,int idx){
        
//         if(str.length()==0){
//             System.out.println(perm+" ");
//             return;
//         }
//         // if(idx == 0){
//         //     System.out.println(idx);
//         // }
//         //System.out.println(idx);
//         for(int i=0;i<=str.length()-1;i++){
//             char currChar = str.charAt(i);
//             String newString = str.substring(0,i);
//             subpermutations(newString, perm+currChar, idx+1);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "gfg";
//         //String str= Integer.toString(n);
//         String perm = "";
//         subpermutations(str,perm,0);


//     }
        
// }
/////////////////////////////////////////////////////////




// public class subsequenceAndPermuatations {
    
//     static void subpermutations(String str,String perm,int idx){
        
      
//         if(idx == str.length()){
//             System.out.println(perm);
//             return;
//         }
      
        
//             char currChar = str.charAt(idx);
            
//             subpermutations(str, perm+currChar, idx+1);

//             subpermutations(str, perm, idx+1);
        
//     }
//     public static void main(String[] args) {
//         String str = "gfg";
       
//         String perm = "";
//         subpermutations(str,perm,0);


//     }
        
// }

// //o/p:
// gfg
// gf
// gg
// g
// fg
// f
// g
//This returns characters
///////////////////////////////////////////////////////

////////////////////////////////////////////////////

///////////////////////////////////////////////////////
//Number of distinct subsequence
// class Solution {
//     int distinctSubsequences(String s) {
        
//         int mod = 1000000007;
//         int dp[] = new int[s.length()+1];
//         dp[0] = 1;
        
//         int ch[] = new int[26];
        
//         for(int i=1;i<dp.length;i++){
//             int val = ch[s.charAt(i-1)-'a'];
//             dp[i] = ((2 * dp[i-1])%mod) - val;
//             dp[i] %= mod;
//             ch[s.charAt(i-1) - 'a'] = dp[i-1];
//         }
//         int ans = (dp[s.length()]+mod)%mod;
//         return ans;
        
//     }
// }
// //o/p:  7 --- >This program returns only number
// gfg
// gf
// gg
// g
// fg
// f
// g
