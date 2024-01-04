// Scrambled string: 
//Given two strings S1 and S2 of equal length, the task is to determine if S2 is a scrambled form of S1.

// Given string str, we can represent it as a binary tree by partitioning it into two non-empty substrings recursively.
// Input: S1=”coder”, S2=”ocder” 
// Output: Yes 
// Explanation: 
// “ocder” is a scrambled form of “coder”
// Input: S1=”abcde”, S2=”caebd” 
// Output: No 
// Explanation: 
// “caebd” is not a scrambled form of “abcde”

//Recursion and HashMap(Memoization)

import java.util.HashMap;
import java.util.Map;

public class scrambleString {
    static HashMap<String,Boolean> map = new HashMap<>();
        static boolean isScramble(String a,String b)
    {
        if(a.equals(b)){
            return true;
        }
        if(a.length() == 0 && b.length() == 0){
            return true;
        }  
        return Solve(a, b, map);
    }

    static boolean Solve(String a, String b, Map<String, Boolean> map){
        if(a.equals(b)){
            return true;
        }
        if(a.length() <= 1){
            return false;
        }
        // if(b.length()<=a.length()){
        //     return false;
        // }
        String key = a + " " + b;
        if(map.containsKey(key)){
            return map.get(key);
        }
        
        int n = a.length();
        boolean ans = false;
        for(int i = 1; i < n; i++){
            boolean swapped = (Solve(a.substring(0, i), b.substring(n - i, n), map) 
            && Solve(a.substring(i, n), b.substring(0, n - i), map));
            boolean notSwapped = (Solve(a.substring(0, i), b.substring(0, i), map) 
            && Solve(a.substring(i, n), b.substring(i, n), map));
            if(swapped || notSwapped){
                ans = true;
                break;
            }
        }
        map.put(key, ans);
        return ans; 
    }
    public static void main(String[] args) {
        String a = "greet";
        String b = "rgeet";
        
       
        boolean result = isScramble(a,b);
        if(result){
            System.out.println("Scrambled");
        }else{
            System.out.println("Not a Scrambled");
        }
    }
}
