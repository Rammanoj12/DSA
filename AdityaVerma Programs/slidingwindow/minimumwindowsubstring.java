// Smallest window in a string containing all the characters of another string
// Given two strings, string, and pattern, the task is to find the smallest substring in string containing all characters of pattern. 

// Examples: 

// Input: string = “this is a test string”, pattern = “tist” 
// Output: “t stri” 
// Explanation: “t stri” contains all the characters of pattern.

// Input: string = “geeksforgeeks”, pattern = “ork” 
// Output: “ksfor”

import java.util.HashMap;
//This code will time limit error in compiler, so prefer second code part
public class minimumwindowsubstring {
    static void solve(String s,String p){
    HashMap<Character,Integer>map = new HashMap<>();
        int i =0,j=0;
        for(char ch : p.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = map.size();
        int size = s.length();
        String ans="";
        int min = Integer.MAX_VALUE;
        while(j<size){
           char ch1 = s.charAt(j);
           if(map.containsKey(ch1)){
            map.put(ch1,map.get(ch1)-1);
             if(map.get(ch1) == 0){
                 count -- ;
           }
           }else{
             j++;
             continue;
           }
          
           if(count == 0){
            //The variable min is used to keep track of the minimum length of the valid substring found so far. 
            //It is updated whenever a new valid substring, i.e., a substring containing all characters from the pattern, is found.
             if(min>j-i+1)
                        {
                            ans=s.substring(i,j+1);
                           min=j-i+1;
                        }
            
           //if character goes to -1 means extra character we need to check while count is 0 and increment i
            while(count ==0){
                char ch2= s.charAt(i);
                if(map.containsKey(ch2)){
                     map.put(ch2, map.get(ch2)+1);
                    if(map.get(ch2)>0){
                    count++;
                    }
                  i++;  
                
                }else{
                   i++;
                }
               
                
                if(count == 0){
                     if(min>j-i+1)
                        {
                            ans=s.substring(i,j+1);
                           min=j-i+1;
                        }
                   
                }
                
            }
            
           }
           
           j++;
        }
        //System.out.println("The minimum length of substring:"+" "+min);
        System.out.println("The minimum string:"+" "+ans);
    }

    //    
    public static void main(String[] args) {
        String s ="timetopractice";
        String p = "toc";
        solve(s,p);
    }
}

///////////////////////////////////////////////////////

// Second code for most time optimised in compiler
//////////////////////////////////////////////////////

//    HashMap<Character, Integer> map = new HashMap<>();
//     //     int i = 0, j = 0;
//     //     int count = p.length(); // Initialize count to the length of the pattern
//     //     int size = s.length();
//     //     String ans = "";
//     //     int min = Integer.MAX_VALUE;

//     //     for (char ch : p.toCharArray()) {
//     //         map.put(ch, map.getOrDefault(ch, 0) + 1);
//     //     }

//     //     while (j < size) {
//     //         char ch1 = s.charAt(j);

//     //         if (map.containsKey(ch1)) {
//     //             if (map.get(ch1) > 0) {
//     //                 count--;
//     //             }
//     //             map.put(ch1, map.get(ch1) - 1);
//     //         }

//     //         while (count == 0) {
//     //             if (min > j - i + 1) {
//     //                 ans = s.substring(i, j + 1);
//     //                 min = j - i + 1;
//     //             }

//     //             char ch2 = s.charAt(i);
//     //             if (map.containsKey(ch2)) {
//     //                 map.put(ch2, map.get(ch2) + 1);
//     //                 if (map.get(ch2) > 0) {
//     //                     count++;
//     //                 }
//     //             }
//     //             i++;
//     //         }

//     //         j++;
//     //     }

//     //     if(min == Integer.MAX_VALUE){
//     //         return "-1";
//     //     }else{
//     //         return ans;
//     //     }
//     // }
