// Given a string S. The task is to find all permutations (need not be different) of a given string.

// Note: return the permutations in lexicographically increasing order.

// Example 1:

// Input:
// S = AAA
// Output: AAA AAA AAA AAA AAA AAA
// Explanation: There are total 6 permutations, as given in the output.

//Time and Space - O(2^N*log(2^N))
// class Solution {
//     public void permute(ArrayList<String>ans,String s,String temp,int index,boolean vis[])
//     {
//         if(temp.length()==s.length())
//         {
//             ans.add(temp);
//             return;
//         }
//         if(index==s.length())
//         {
          
//             return;
//         }
        
//         //take
//         if(!vis[index])
//         {
//              vis[index]=true;
//              permute(ans,s,temp+s.charAt(index),0,vis);
//               vis[index]=false;
//         }
       
//         //not take
//         permute(ans,s,temp,index+1,vis);
//     }
//     public ArrayList<String> permutation(String S)
//     {
       
//         ArrayList<String>ans=new ArrayList<>();
//         permute(ans,S,"",0,new boolean[S.length()]);
//         Collections.sort(ans);
//         return ans;
//     }
// }

