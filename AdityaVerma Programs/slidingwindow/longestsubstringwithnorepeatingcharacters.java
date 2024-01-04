//WITHOUT K ------------->

// Given a string S, find the length of the longest substring without repeating characters.


// Example 1:

// Input:
// S = "geeksforgeeks"
// Output:
// 7
// Explanation:
// Longest substring is
// "eksforg".

import java.util.HashMap;

public class longestsubstringwithnorepeatingcharacters {
    static void solve(String s,int size){
        HashMap<Character,Integer> map  = new HashMap<>();
        int count = map.size();
        int i =0,j = 0;
        int max = Integer.MIN_VALUE;
        while(j<size){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch, 0)+1);
            if(map.get(ch) ==1 ){
                count++;
            }

            if(count > j-i+1){
                j++;
            }else if(count == j-i+1){
                max= Math.max(max,j-i+1);
                j++;
            }else if(count < j-i+1){
                while(count < j-i+1){
                char ch1 = s.charAt(i);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1) == 0){
                    map.remove(ch1);
                    count--;
                }
                i++;
            }
            j++;
        }
        }
        if(max == Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(max);
        }
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int size = s.length();
        solve(s,size);
    }
}
