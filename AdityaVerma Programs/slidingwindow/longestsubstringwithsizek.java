//WITH K -------------> BOTH ARE SAME 
// 1)UNIQUE characters
// 2)NOT REPEATING CHARACTERS

// Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

// Example 1:

// Input:
// S = "aabacbebebe", K = 3
// Output: 
// 7
// Explanation: 
// "cbebebe" is the longest substring with 3 distinct characters.

import java.util.HashMap;
//Two pointer
public class longestsubstringwithsizek {
    static void solve(String s ,int k ){
        HashMap<Character,Integer> map = new HashMap<>();
        int count = map.size();
        int i =0;
        int j =0;
        int max= Integer.MIN_VALUE;
        int size = s.length();
        while(j<size){
            char ch= s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch) ==1){
                count ++;
            }
            
            if(count<k){
                j++;
            }else if(count ==k){
                max = Math.max(max,j-i+1);
                j++;
            }else if(count>k){
                while(count>k){
                    char ch1= s.charAt(i);
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
        
        if(max ==  Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(max);
        }

    }
    public static void main(String[] args) {
        String s= "aabacbebebe";
        int k =3;
        solve(s,k);
    }
}

