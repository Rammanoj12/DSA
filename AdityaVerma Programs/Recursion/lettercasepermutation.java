// Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.

// Return a list of all possible strings we could create. Return the output in any order.

 

// Example 1:

// Input: s = "a1b2"
// Output: ["a1b2","a1B2","A1b2","A1B2"]



// public class lettercasepermutation {
//     static void solve(String ip,String op){
//         if(ip.length() ==0){
//         System.out.println(op);
          
//           return;
//         }
//         String op1 =(op+ip.charAt(0)).toLowerCase();
//         String op2 =(op+ip.charAt(0)).toUpperCase();
//        solve(ip.substring(1), op1);
//         solve(ip.substring(1), op2);
        
// }
//     public static void main(String[] args) {
//         //ArrayList<String> list = new ArrayList<>();
//         String ip = "a1b2";
//         String op ="";
//         //This condition is only applicable to permutationswithspaces 
//         // and this restricts the firt character and calls the function
//         op=(op+ip.charAt(0));
//         ip=ip.substring(1);
//         solve(ip,op);
      
        
        
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////
//Time  and space are same O(2^N)
///Linked list
// import java.util.*;
// public class lettercasepermutation {
// public static LinkedList<String> findletterCasePermutation(String s) {
//         LinkedList<String> res=new LinkedList<>();
//         res.add(s);
//         int n=s.length();
//         for(int i=n-1;i>=0;i--){
//             char c=s.charAt(i);
//             if(Character.isLetter(c)){
//                 int size=res.size();
//                 while(size-- >0){
//                     String str=res.poll();
//                     String left=str.substring(0,i);
//                     String right=str.substring(i+1,n);
//                     res.add(left+Character.toLowerCase(c)+right);
//                      res.add(left+Character.toUpperCase(c)+right);
//                 }
//             }
//         }
//         return res;
//     }
//       public static void main(String[] args) {
        
//         String ip = "a1b2";
//        LinkedList<String> result = findletterCasePermutation(ip);
//       System.out.println(result);
// }
// }