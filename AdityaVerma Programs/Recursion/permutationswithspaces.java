// Given a string you need to print all possible strings that can be made by placing spaces (zero or one) in between them. The output should be printed in sorted increasing order of strings

// Example 1:

// Input:
// S = "ABC"
// Output: (A B C)(A BC)(AB C)(ABC)
// Explanation:
// ABC
// AB C
// A BC
// A B C
// These are the possible combination of "ABC".

import java.util.ArrayList;
//TIME AND SPACE ARE O(2^N)
// public class permutationswithspaces {
//     static void solve(String ip,String op){
//         if(ip.length() ==0){
//         System.out.println(op);
          
//           return;
//         }
//        solve(ip.substring(1), op+ip.charAt(0));
//         solve(ip.substring(1), op+"_"+ip.charAt(0));
        
// }
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         String ip = "ABCD";
//         String op ="";
//         op+=ip.charAt(0);
//         ip=ip.substring(1);
//         solve(ip,op);
      
        
        
//     }
// }
///////////////////////////////////////////////////////////////////
//GFG CODE
// class Solution{
//     static ArrayList<String> solve(ArrayList<String> list,String ip,String op){
//         if(ip.length() ==0 ){
//             list.add(op);
//             return list;
//         }
//         solve(list,ip.substring(1),op+" "+ip.charAt(0));
//         solve(list,ip.substring(1),op+ip.charAt(0));
//         return list;
//     }
    
//     ArrayList<String> permutation(String ip){
//         ArrayList<String> list = new ArrayList<>(); 
//         String op ="";
        
//         op+=ip.charAt(0);
//         ip=ip.substring(1);
//         list= solve(list,ip,op);
//         return list;
//     }
    
// }