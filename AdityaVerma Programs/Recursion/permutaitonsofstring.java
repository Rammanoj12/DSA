// Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.

// Example 1:

// Input: ABC
// Output:
// ABC ACB BAC BCA CAB CBA
// Explanation:
// Given string ABC has permutations in 6 
// forms as ABC, ACB, BAC, BCA, CAB and CBA .


//Time and space - 0(N!)
// class Solution {
//     public static void permutation(String str, String t, List<String> ans){
//         if(str.equals("")){
//             ans.add(t);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             String prev=str.substring(0, i);
//             String next=str.substring(i+1);
//             String rem=prev+next;
//             permutation(rem, t+ch, ans);
//         }
//     }
//     public List<String> find_permutation(String S) {
//         // Code here
//         List<String> ans=new ArrayList<>();
//         permutation(S, "", ans);
//         HashSet<String> arr=new HashSet<>();
//         for(int i=0;i<ans.size();i++){
//             arr.add(ans.get(i));
//         }
//         List<String> newAns=new ArrayList<>();
//         for(String s : arr)
//             newAns.add(s);
//         Collections.sort(newAns);
//         return newAns;
        
//     }
// }